package com.ambulanceroute;

import java.util.ArrayList;
import java.util.List;


public class Route {
	
	    private List<HospitalUnit> units = new ArrayList<>();
	    private int currentIndex = 0;

	    // Add hospital unit
	    public void addUnit(String name, boolean available) {
	        units.add(new HospitalUnit(name, available));
	    }

	    // Find nearest available unit (circular)
	    public void findAvailableUnit() {
	        if (units.isEmpty()) {
	            System.out.println("🚨 No hospital units available.");
	            return;
	        }

	        int checked = 0;

	        while (checked < units.size()) {
	            HospitalUnit unit = units.get(currentIndex);

	            if (unit.available) {
	                System.out.println(" Patient treated at: " + unit.name);
	                return;
	            } else {
	                System.out.println( unit.name + " not available, redirecting...");
	            }

	            currentIndex = (currentIndex + 1) % units.size();
	            checked++;
	        }

	        System.out.println(" No available unit found!");
	    }

	    // Remove unit under maintenance
	    public void removeUnit(String unitName) {
	        for (int i = 0; i < units.size(); i++) {
	            if (units.get(i).name.equals(unitName)) {
	                units.remove(i);
	                System.out.println(" Unit removed (Maintenance): " + unitName);
	                currentIndex = currentIndex % units.size();
	                return;
	            }
	        }
	        System.out.println("Unit not found.");
	    }

	    // Display route
	    public void displayRoute() {
	        if (units.isEmpty()) {
	            System.out.println("No units in route.");
	            return;
	        }

	        for (HospitalUnit unit : units) {
	            System.out.print(unit.name + " → ");
	        }
	        System.out.println("(Circular)");
	    }
	}
