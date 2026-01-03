package com.smarthomeautomation;

public class SmartHomeAutomation {
	public static void main(String[] args) {

        Appliance light = new Light("Living Room Light");
        Appliance fan = new Fan("Ceiling Fan");
        Appliance ac = new AC("Bedroom AC");

        UserController controller = new UserController();

        controller.operateDevice(light, true);
        controller.operateDevice(fan, true);
        controller.operateDevice(ac, true);

        controller.compareUsage(ac, fan);
        controller.compareUsage(light, fan);

        controller.operateDevice(ac, false);
    }
}