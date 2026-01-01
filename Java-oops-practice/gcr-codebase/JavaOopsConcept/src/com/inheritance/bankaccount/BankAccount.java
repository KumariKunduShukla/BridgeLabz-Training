package com.inheritance.bankaccount;

public class BankAccount {
	// Common attributes for all account types
    protected String accountNumber;
    protected double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display basic account information
    public void displayBasicDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}