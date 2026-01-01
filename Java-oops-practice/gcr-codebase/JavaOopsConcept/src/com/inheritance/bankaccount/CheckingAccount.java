package com.inheritance.bankaccount;

//CheckingAccount inherits from BankAccount
public class CheckingAccount extends BankAccount {

   // Unique attribute for checking account
   private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
     super(accountNumber, balance);
     this.withdrawalLimit = withdrawalLimit;
   }

    // Method specific to CheckingAccount
    public void displayAccountType() {
     System.out.println("Account Type: Checking Account");
     displayBasicDetails();
     System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
 }
}
