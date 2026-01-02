package com.encapsulationandpolymorphism.bankingsystem;

import java.util.ArrayList;
import java.util.List;

public class BankingAap {
	public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingAccount("SB101", "Amit", 50000));
        accounts.add(new CurrentAccount("Kotak202", "Neha", 100000));

        processAccounts(accounts);
    }

    // processing
    public static void processAccounts(List<BankAccount> accounts) {

        for (BankAccount account : accounts) {

            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());

            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanAccount.calculateLoanEligibility());
            }

            System.out.println("----------------------------------");
        }
    }
}