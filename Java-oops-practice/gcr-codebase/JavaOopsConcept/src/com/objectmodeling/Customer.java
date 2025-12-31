package com.objectmodeling;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	String name;
    ArrayList<Account> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.bank.bankName +
                               ", Balance: " + acc.balance);
        }
    }
}


