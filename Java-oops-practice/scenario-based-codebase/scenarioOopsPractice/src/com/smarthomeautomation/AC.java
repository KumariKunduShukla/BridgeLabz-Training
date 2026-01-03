package com.smarthomeautomation;

public class AC extends Appliance {

    AC(String name) {
        super(name, 1500);
    }

    @Override
    public void turnOn() {
        System.out.println("AC cooling started");
    }
}
