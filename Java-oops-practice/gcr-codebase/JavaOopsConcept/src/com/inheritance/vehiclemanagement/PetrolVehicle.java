package com.inheritance.vehiclemanagement;

//PetrolVehicle inherits from Vehicle and implements Refuelable
public class PetrolVehicle extends Vehicle implements Refuelable {

    // Petrol vehicle-specific attribute
    private int fuelTankCapacity; // in liters

    public PetrolVehicle(int maxSpeed, String model, int fuelTankCapacity) {
      super(maxSpeed, model);
      this.fuelTankCapacity = fuelTankCapacity;
   }

   @Override
   public void refuel() {
     System.out.println("Refueling petrol vehicle with " + fuelTankCapacity + " liters.");
 }
}
