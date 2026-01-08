package com.medistore;

import java.time.LocalDate;

public abstract class Medicine implements ISellable{
	
	    private String name;
	    private double price;
	    private int quantity;
	    protected LocalDate expiryDate;

	    // Default quantity constructor
	    public Medicine(String name, double price, LocalDate expiryDate) {
	        this(name, price, expiryDate, 10);
	    }

	    // Parameterized constructor
	    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
	        this.name = name;
	        this.price = price;
	        this.expiryDate = expiryDate;
	        this.quantity = quantity;
	    }

	    // Encapsulated price calculation
	    private double calculatePrice(int qty) {
	        double total = price * qty;
	        if (qty >= 5) {
	            total = total - (total * 10 / 100); // 10% discount
	        }
	        return total;
	    }

	    // Sell medicine
	    public void sell(int qty) {
	        if (qty > quantity) {
	            System.out.println("Insufficient stock");
	            return;
	        } 
	        quantity -= qty;
	        System.out.println(" Sold " + qty + " units");
	        System.out.println(" Total Bill: ₹" + calculatePrice(qty));
	        System.out.println(" Remaining Stock: " + quantity);
			
	    }

	    // Common method
	    public void display() {
	        System.out.println("Medicine: " + name);
	        System.out.println("Price: ₹" + price);
	        System.out.println("Expiry Date: " + expiryDate);
	        System.out.println("Stock: " + quantity);
	   }

		
 }

