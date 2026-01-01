package com.inheritance.vehicleandtransport;

public class Vehicle {
	// Common attributes for all vehicles
    protected int maxSpeed;
    protected String fuelType;

    // Constructor to initialize vehicle details
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}