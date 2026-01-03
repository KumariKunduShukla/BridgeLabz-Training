package com.ridehailingaap;

public class SUV extends Vehicle {
	// attributes 
	double baseFare=750;
	
	SUV(String vehicleNumber, int capacity) {
		super(vehicleNumber, 6);
		
	}
	
	@Override
	public double calculateFare(double distance) {
		double rate = 89.0;
		double totalFare = distance*baseFare+rate;
		return totalFare;

	}
}