package com.inheritance.vehicleandtransport;

//Truck class extending Vehicle
public class Truck extends Vehicle {

 // Unique attribute for Truck
 private double loadCapacity; // in tons

 // Constructor calling superclass constructor
 public Truck(int maxSpeed, String fuelType, double loadCapacity) {
     super(maxSpeed, fuelType);
     this.loadCapacity = loadCapacity;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Load Capacity: " + loadCapacity + " tons");
 }
}
