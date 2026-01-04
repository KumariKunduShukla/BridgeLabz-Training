package com.bankaccountmanagement;

public class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 2.0;

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE / 100; // operator usage
        setBalance(getBalance() + interest);
        System.out.println("Current Account Interest Added: " + interest);
    }
}
