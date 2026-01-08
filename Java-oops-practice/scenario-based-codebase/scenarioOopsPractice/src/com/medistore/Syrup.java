package com.medistore;

import java.time.LocalDate;

public class Syrup extends Medicine {

	public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
		super(name, price, expiryDate, quantity);
		
	}

	@Override
	public void checkExpiry() {
		 if (expiryDate.minusDays(15).isBefore(LocalDate.now())) {
	            System.out.println(" Syrup nearing expiry (liquid sensitive)");
	        } else {
	            System.out.println(" Syrup is safe");
	        }
	    }
}
