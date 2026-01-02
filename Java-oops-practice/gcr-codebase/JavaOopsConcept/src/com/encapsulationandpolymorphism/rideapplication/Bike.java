package com.encapsulationandpolymorphism.rideapplication;

public class Bike extends Vehicle implements GPS {

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // no base charge
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocationInternal();
    }

    @Override
    public void updateLocation(String location) {
        setCurrentLocationInternal(location);
    }
}
