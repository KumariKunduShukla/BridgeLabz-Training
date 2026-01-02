package com.encapsulationandpolymorphism.rideapplication;

public class Car extends Vehicle implements GPS {

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50; // base charge
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
