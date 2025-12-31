package com.objectmodeling;

public class BankAssociation {
	public static void main(String[] args) {

        Bank bank1= new Bank("SBI");
        Bank bank2= new Bank("Kotak");

        Customer customer = new Customer("Kundu");

        Account a1 = bank1.openAccount(customer, 101);
        a1.balance = 5000;

        Account a2 = bank1.openAccount(customer, 102);
        a2.balance = 8000;
        
        Account a3 = bank2.openAccount(customer, 305);
        a3.balance = 15000;

        customer.viewBalance();
    }
}


