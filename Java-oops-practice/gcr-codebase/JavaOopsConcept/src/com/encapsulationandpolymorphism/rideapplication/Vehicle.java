package com.encapsulationandpolymorphism.rideapplication;

public abstract class Vehicle {
	private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Encapsulated location data
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Not Updated";
    }

    // Getters (no direct modification)
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    protected String getCurrentLocationInternal() {
        return currentLocation;
    }

    protected void setCurrentLocationInternal(String location) {
        this.currentLocation = location;
    }

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per KM: " + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    // Abstract method
    public abstract double calculateFare(double distance);
}