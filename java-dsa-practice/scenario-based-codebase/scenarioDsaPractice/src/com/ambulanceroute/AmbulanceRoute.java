package com.ambulanceroute;

public class AmbulanceRoute {
	public static void main(String[] args) {

		Route route = new Route();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        System.out.println(" Hospital Route:");
        route.displayRoute();

        System.out.println("\n Searching for available unit...");
        route.findAvailableUnit();

        System.out.println("\n Removing Radiology (Maintenance)");
        route.removeUnit("Radiology");

        System.out.println("\n Updated Route:");
        route.displayRoute();
    }
}