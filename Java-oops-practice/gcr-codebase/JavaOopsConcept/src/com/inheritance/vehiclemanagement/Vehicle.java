package com.inheritance.vehiclemanagement;

public class Vehicle {
	// Common attributes for all vehicles
    protected int maxSpeed;
    protected String model;

    // Constructor to initialize vehicle details
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display basic vehicle information
    public void displayVehicleInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}