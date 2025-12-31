package com.objectmodeling;

public class Bank {
	String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    Account openAccount(Customer customer, int accNo) {
        Account account = new Account(accNo, this);
        customer.addAccount(account);
        System.out.println("Account opened in " + bankName);
        return account;
    }
}