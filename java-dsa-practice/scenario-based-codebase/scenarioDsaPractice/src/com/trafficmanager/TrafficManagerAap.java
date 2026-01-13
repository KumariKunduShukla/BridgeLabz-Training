package com.trafficmanager;

public class TrafficManagerAap {
	public static void main(String[] args) {

        TrafficManager tm = new TrafficManager();
        
        System.out.println("Added Vehicle");
        tm.addToQueue("CAR-101");
        tm.addToQueue("CAR-102");
        tm.addToQueue("CAR-103");
        tm.addToQueue("CAR-104");
        
        System.out.println(" ");
        
        System.out.println("Vehicle enterd roundabout");
        tm.enterRoundabout();
        tm.enterRoundabout();
        tm.enterRoundabout();
        System.out.println("");

        System.out.println("Print Vehicle round about");
        tm.printRoundabout();
        tm.printQueue();
        System.out.println("");

        tm.exitRoundabout();

        tm.enterRoundabout();

        tm.printRoundabout();
        tm.printQueue();
    }
}