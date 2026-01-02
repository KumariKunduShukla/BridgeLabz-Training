package com.encapsulationandpolymorphism.vehiclerental;

public class Truck extends Vehicle implements Insurable {

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate, policyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 1000; // loading charge
    }

    @Override
    public double calculateInsurance() {
        return 1500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance | Policy: " + getInsurancePolicyNumber();
    }
}
