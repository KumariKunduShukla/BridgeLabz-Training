package com.inheritance.vehiclemanagement;

public class VehicleManagement {
	public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3", 75);
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City", 40);

        // Display vehicle information
        ev.displayVehicleInfo();
        ev.charge();

        System.out.println("---------------------");

        pv.displayVehicleInfo();
        pv.refuel();
    }
}