package com.ridehailingaap;

public class Mini extends Vehicle{
	// attributes
	double baseFare=550;

	Mini(String vehicleNumber, int capacity) {
		super(vehicleNumber, 5);
		
	}

	@Override
	public double calculateFare(double distance) {
		double rate = 45.0;
		double totalFare = distance*baseFare+rate;
		return totalFare;
   }
}
