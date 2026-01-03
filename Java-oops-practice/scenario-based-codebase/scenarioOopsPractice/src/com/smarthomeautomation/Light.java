package com.smarthomeautomation;

 public class Light extends Appliance {

    Light(String name) {
        super(name, 60);
    }

    @Override
    public void turnOn() {
        System.out.println("Light is glowing softly");
    }
}
