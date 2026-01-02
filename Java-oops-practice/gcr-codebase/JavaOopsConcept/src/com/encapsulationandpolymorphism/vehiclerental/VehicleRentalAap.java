package com.encapsulationandpolymorphism.vehiclerental;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalAap {
	public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000, "CAR-INS-01"));
        vehicles.add(new Bike("BIKE202", 500, "BIKE-INS-02"));
        vehicles.add(new Truck("TRUCK303", 5000, "TRUCK-INS-03"));

        int days = 4;

        calculateTotalCost(vehicles, days);
    }

    // method
    public static void calculateTotalCost(List<Vehicle> vehicles, int days) {

        for (Vehicle vehicle : vehicles) {

            double rentalCost = vehicle.calculateRentalCost(days);
            double insuranceCost = 0;

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                insuranceCost = insurable.calculateInsurance();
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println("--------------------------------");
        }
    }
}