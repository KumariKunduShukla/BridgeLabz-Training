package com.encapsulationandpolymorphism.rideapplication;

public class Auto extends Vehicle implements GPS {

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) + 20; // small service charge
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
