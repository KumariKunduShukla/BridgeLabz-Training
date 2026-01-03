package com.smarthomeautomation;

public class Appliance implements Controllable {

    protected String name;
    private boolean isOn;
    private int powerUsage; // in watts

    // Default power setting
    Appliance(String name) {
        this.name = name;
        this.powerUsage = 100;
    }

    // User-defined power setting
    Appliance(String name, int powerUsage) {
        this.name = name;
        this.powerUsage = powerUsage;
    }

    protected int getPowerUsage() {
        return powerUsage;
    }

    protected boolean isOn() {
        return isOn;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " turned ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " turned OFF");
    }
}
