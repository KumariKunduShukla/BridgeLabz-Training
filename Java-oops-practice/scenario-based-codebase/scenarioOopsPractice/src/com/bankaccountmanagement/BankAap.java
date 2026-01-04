package com.bankaccountmanagement;

public class BankAap {
	public static void main(String[] args) {

        Account acc1 = new SavingsAccount("SB101", 10000);
        Account acc2 = new CurrentAccount("CA202");

        acc1.deposit(2000);
        acc1.calculateInterest();
        acc1.checkBalance();

        System.out.println();

        acc2.deposit(5000);
        acc2.withdraw(1000);
        acc2.calculateInterest();
        acc2.checkBalance();
    }
}