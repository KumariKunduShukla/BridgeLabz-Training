package com.inheritance.bankaccount;

public class BankingSystem {
	public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("SA101", 50000, 4.5);
        CheckingAccount checking = new CheckingAccount("CA102", 30000, 10000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD103", 100000, 5);

        savings.displayAccountType();
        System.out.println("----------------------");

        checking.displayAccountType();
        System.out.println("----------------------");

        fixedDeposit.displayAccountType();
    }
}