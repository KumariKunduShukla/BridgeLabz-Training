package com.inheritance.smarthome;

public class SmartHome {
	public static void main(String[] args) {

        // Creating a Thermostat device
        Device thermostat1 = new Thermostat("THERMO-101", true, 24.5);
        Device thermostat2 = new Thermostat("THERMO-102", false, 26.5);
        Device thermostat3 = new Thermostat("THERMO-103", true, 32.5);

        // method call
        thermostat1.displayStatus();
        thermostat2.displayStatus();
        thermostat3.displayStatus();
    }
}