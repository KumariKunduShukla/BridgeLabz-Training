package com.ridehailingaap;

public class RideService implements IRideService {
	 private Driver driver;
	 private Vehicle vehicle;
	 private double fare;
	    
	    public RideService(Vehicle vehicle, Driver driver) {
	    	this.vehicle=vehicle;
	        this.driver = driver;
		
	}

	@Override
	public void bookRide(double distance) {
		fare = vehicle.calculateFare(distance);
        System.out.println("Ride booked with  "+vehicle.getType());
        System.out.println("Driver: " +driver.getRating());
        System.out.println("Estimated Fare: ₹" + fare);
	}

	@Override
	public void endRide() {
		System.out.println("Ended the ride safely !");
		System.out.println("Total fare:"+fare);
	}

}
