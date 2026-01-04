package com.bankaccountmanagement;

public class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 4.0;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE / 100; // operator usage
        setBalance(getBalance() + interest);
        System.out.println("Savings Account Interest Added: " + interest);
    }
}
