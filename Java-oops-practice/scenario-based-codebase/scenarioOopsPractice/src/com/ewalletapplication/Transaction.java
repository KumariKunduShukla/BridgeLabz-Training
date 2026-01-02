package com.ewalletapplication;

public class Transaction {
	// attributes
	private String description;
    private double amount;

    Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getTransactionDetails() {
        return description + " : ₹" + amount;
    }
}