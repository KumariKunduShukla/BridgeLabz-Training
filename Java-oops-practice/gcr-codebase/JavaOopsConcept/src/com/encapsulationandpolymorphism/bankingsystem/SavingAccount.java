package com.encapsulationandpolymorphism.bankingsystem;

public class SavingAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.04; // 4%

    public SavingAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}
