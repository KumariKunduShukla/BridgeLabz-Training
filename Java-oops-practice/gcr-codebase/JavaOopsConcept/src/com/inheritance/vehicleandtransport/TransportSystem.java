package com.inheritance.vehicleandtransport;

public class TransportSystem {
	public static void main(String[] args) {

        // Array of Vehicle type holding different subclass objects
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15.5);
        vehicles[2] = new Bike(160, "Petrol", true);

        // method calls
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("-------------------------");
        }
    }
}