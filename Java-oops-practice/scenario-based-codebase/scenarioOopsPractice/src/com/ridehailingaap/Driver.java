package com.ridehailingaap;

public class Driver {
	// attributes
	private String driverName;
	private String licenseNumber;
	private float rating;
	
	Driver(String driverName, String licenseNumber, float rating){
		this.driverName = driverName;
		this.rating = rating;
		this.licenseNumber = licenseNumber;
	}
	
	
	public String getName() {
        return driverName;
    }

    public double getRating() {
        return rating;
    }

}
