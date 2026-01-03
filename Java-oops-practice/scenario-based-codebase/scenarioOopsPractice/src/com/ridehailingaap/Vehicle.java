package com.ridehailingaap;

public abstract class Vehicle {
	// attributes
	private String vehicleNumber;
	private int capacity;
	private String vehicleType;
	
	Vehicle(String vehicleNumber, int capacity, String vehicleType){
		this.vehicleNumber = vehicleNumber;
		this.capacity = capacity;
		this.vehicleType = vehicleType;
	}
	 Vehicle(String vehicleNumber, int capacity){
		 this.vehicleNumber = vehicleNumber;
			this.capacity = capacity;
		  }
	
	 public String getType() {
	        return vehicleType;
	    }
	 
	public abstract double  calculateFare(double distance );
	 
	

}
