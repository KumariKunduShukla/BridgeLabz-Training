package com.encapsulationandpolymorphism.vehiclerental;

public abstract class Vehicle {
	private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Sensitive data (encapsulated)
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Getters & setters (controlled access)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        if (rentalRate > 0) {
            this.rentalRate = rentalRate;
        }
    }

    // Restricted access to sensitive info
    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);
}