package com.inheritance.vehicleandtransport;

//Car class extending Vehicle
public class Car extends Vehicle {

 // Unique attribute for Car
 private int seatCapacity;

 // Constructor calling superclass constructor
 public Car(int maxSpeed, String fuelType, int seatCapacity) {
     super(maxSpeed, fuelType);
     this.seatCapacity = seatCapacity;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Seat Capacity: " + seatCapacity);
 }
}
