package com.medistore;

import java.time.LocalDate;

public class Tablet extends Medicine{

	public Tablet(String name, double price, LocalDate expiryDate, int quantity) {
		super(name, price, expiryDate,quantity);
		
	}

	@Override
	public void checkExpiry() {
		if(expiryDate.isBefore(LocalDate.now())) {
			
			System.out.println(" Tablet is expired");
        } 
		else {
			
            System.out.println(" Tablet is safe to use");
        }
		
    }
}
