package com.inheritance.smarthome;

//Thermostat class extending Device
public class Thermostat extends Device {

   // Additional attribute specific to Thermostat
   private double temperatureSetting;

   // Constructor calling superclass constructor
   public Thermostat(String deviceId, boolean status, double temperatureSetting) {
   super(deviceId, status);
    this.temperatureSetting = temperatureSetting;
 }

   @Override
    public void displayStatus() {
    // Call parent class method
    super.displayStatus();

     // Display thermostat-specific information
     System.out.println("Temperature Setting: " + temperatureSetting + "°C");
 }
}
