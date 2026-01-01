package com.inheritance.smarthome;

public class Device {
	// Common attributes for all devices
    protected String deviceId;
    protected boolean status; 

    // Constructor to initialize device details
    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}