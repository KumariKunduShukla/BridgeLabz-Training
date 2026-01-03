package com.smarthomeautomation;

public class Fan extends Appliance {

    Fan(String name) {
        super(name, 120);
    }

    @Override
    public void turnOn() {
        System.out.println("Fan started rotating");
    }
}

