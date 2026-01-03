package com.ridehailingaap;

public class CabbyGoAap {
	public static void main(String[] args)
	{
		Vehicle vehicle = new Sedan("DL01AB1234", 7);
		Vehicle vehicle1 = new Mini("DLM01AB1234", 4);  
		Vehicle vehicle2 = new Sedan("DL231AB1234", 8);  
		Vehicle vehicle3 = new SUV("DL45AB1234", 6);  
		Vehicle vehicle4 = new SUV("DL05AB1234", 6);  
		Vehicle vehicle5  = new Mini("DL08AB1234", 8);  
        Driver driver = new Driver("Ravi", "LIC98765", 4.5f);
        Driver driver1 = new Driver("Utkarsh", "LIC98775",5);
        Driver driver2 = new Driver("Anuj", "LIC98666", 3.4f);
        Driver driver3 = new Driver("Krishna", "LIC988766", 2.3f);

        IRideService ride = new RideService(vehicle, driver);
        IRideService ride1 = new RideService(vehicle1, driver2);
        IRideService ride2 = new RideService(vehicle5, driver3);
        IRideService ride3 = new RideService(vehicle2, driver);
        IRideService ride4 = new RideService(vehicle4, driver2);
        IRideService ride5 = new RideService(vehicle5, driver2);
        IRideService ride6 = new RideService(vehicle5, driver3);

        ride.bookRide(10);   
        ride.endRide();
        System.out.println("----------------------------");
        
        ride1.bookRide(4);   
        ride1.endRide();
        System.out.println("----------------------------");
        
        ride2.bookRide(2);   
        ride2.endRide();
        System.out.println("----------------------------");
        
        ride3.bookRide(7);   
        ride3.endRide();
        System.out.println("----------------------------");
        
        ride4.bookRide(4);   
        ride4.endRide();
        System.out.println("----------------------------");
		
	}

}
