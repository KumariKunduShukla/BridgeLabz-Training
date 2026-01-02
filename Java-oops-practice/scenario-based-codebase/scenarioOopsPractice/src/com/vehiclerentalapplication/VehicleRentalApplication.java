package com.vehiclerentalapplication;

public class VehicleRentalApplication {
	public static void main(String[] args) {

        Customer c1 = new Customer(1, "Krishna");
        Customer c2 = new Customer(2, "Kris");

        Vehicle v1 = new Bike(101, "Hero", 300);
        Vehicle v2 = new Car(102, "Honda", 1200);
        Vehicle v3 = new Truck(103, "Tata", 2500);

        c1.rentVehicle(v1, 3);
        
        c1.rentVehicle(v2, 2);
        c1.rentVehicle(v3, 1);
        c2.rentVehicle(v1, 3);
        c2.rentVehicle(v2, 2);
        c2.rentVehicle(v3, 1);
    }
}