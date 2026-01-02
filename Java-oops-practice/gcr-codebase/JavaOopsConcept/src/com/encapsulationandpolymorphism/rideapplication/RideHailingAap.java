package com.encapsulationandpolymorphism.rideapplication;

import java.util.ArrayList;
import java.util.List;

public class RideHailingAap {
	public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", "Rahul", 15));
        vehicles.add(new Car("CAR301", "Krishna", 17));
        vehicles.add(new Car("CAR401", "Sakshi", 19));
        vehicles.add(new Bike("BIKE202", "Amit", 8));
        vehicles.add(new Auto("AUTO303", "Suresh", 10));

        calculateFareForRide(vehicles, 12.5);
    }

    // method
    public static void calculateFareForRide(List<Vehicle> vehicles, double distance) {

        for (Vehicle vehicle : vehicles) {

            vehicle.getVehicleDetails();

            double fare = vehicle.calculateFare(distance);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Total Fare: " + fare);

            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                gps.updateLocation("City Center");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }

            System.out.println("-----------------------------------");
        }
    }
}
