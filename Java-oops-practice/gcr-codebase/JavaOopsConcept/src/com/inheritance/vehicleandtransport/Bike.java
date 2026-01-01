package com.inheritance.vehicleandtransport;

//Motorcycle class extending Vehicle
public class Bike extends Vehicle {

 // Unique attribute for Motorcycle
 private boolean hasGear;

 // Constructor calling superclass constructor
 public Bike(int maxSpeed, String fuelType, boolean hasGear) {
     super(maxSpeed, fuelType);
     this.hasGear = hasGear;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Has Gear: " + hasGear);
 }
}
