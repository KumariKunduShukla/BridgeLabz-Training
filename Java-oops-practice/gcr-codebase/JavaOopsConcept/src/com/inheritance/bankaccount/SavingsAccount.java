package com.inheritance.bankaccount;

//SavingsAccount inherits from BankAccount
public class SavingsAccount extends BankAccount {

    // Unique attribute for savings account
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
     super(accountNumber, balance);
     this.interestRate = interestRate;
    }

    // Method specific to SavingsAccount
     public void displayAccountType() {
      System.out.println("Account Type: Savings Account");
      displayBasicDetails();
      System.out.println("Interest Rate: " + interestRate + "%");
 }
}
