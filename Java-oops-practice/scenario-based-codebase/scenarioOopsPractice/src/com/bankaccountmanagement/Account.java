package com.bankaccountmanagement;

public abstract class Account implements ITransaction {

    protected String accountNumber;   // protected → accessible to subclasses
    private double balance;            // encapsulation: private balance

    // Constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // Constructor with opening balance
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    // Getter for balance (controlled access)
    protected double getBalance() {
        return balance;
    }

    // Setter for balance (used internally only)
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Polymorphic method
    abstract void calculateInterest();
}
