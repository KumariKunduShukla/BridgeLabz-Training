package com.vehiclerentalapplication;

public class Customer {
	    // attributes
	    private int customerId;
	    private String name;

	    Customer(int customerId, String name) {
	        this.customerId = customerId;
	        this.name = name;
	    }

	    public void rentVehicle(Vehicle v, int days) {
	        v.getDetails();
	        System.out.println("Total Rent: ₹" + v.calculateRent(days));
	        System.out.println("--------------------------------------");
	    }
	}
