package com.inheritance.bankaccount;

//FixedDepositAccount inherits from BankAccount
public class FixedDepositAccount extends BankAccount {

   // Unique attribute for fixed deposit account
   private int depositTenure; // in years

   public FixedDepositAccount(String accountNumber, double balance, int depositTenure) {
     super(accountNumber, balance);
     this.depositTenure = depositTenure;
   }

   // Method specific to FixedDepositAccount
    public void displayAccountType() {
     System.out.println("Account Type: Fixed Deposit Account");
     displayBasicDetails();
     System.out.println("Deposit Tenure: " + depositTenure + " years");
 }
}
