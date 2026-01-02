package com.ewalletapplication;

public class Wallet {
	private double balance;

    // Normal wallet initialization
    Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    // Wallet with referral bonus
    Wallet(double initialBalance, double referralBonus) {
        this.balance = initialBalance + referralBonus;
    }

    protected void addMoney(double amount) {
        balance = balance + amount;
    }

    protected boolean deductMoney(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}