package com.inheritance.vehiclemanagement;

//ElectricVehicle inherits from Vehicle
public class ElectricVehicle extends Vehicle {

   // Electric vehicle-specific attribute
   private int batteryCapacity; // in kWh

   public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
     super(maxSpeed, model);
     this.batteryCapacity = batteryCapacity;
 }

   // Method specific to electric vehicles
   public void charge() {
     System.out.println("Charging electric vehicle (" + batteryCapacity + " kWh battery).");
  }
}

