package com.objectmodeling;

public class Account {
	int accountNumber;
    double balance;
    Bank bank;

    Account(int accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.balance = 0;
    }
}