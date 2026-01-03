package com.ridehailingaap;

public  class Sedan extends Vehicle {
	// attributes 
	double baseFare=650;
	
	Sedan(String vehicleNumber, int capacity) {
		super(vehicleNumber, capacity);
		
	}
	
	@Override
	public double calculateFare(double distance) {
		double rate = 65.0;
		double totalFare = distance*baseFare+rate;
		return totalFare;
   }

}
