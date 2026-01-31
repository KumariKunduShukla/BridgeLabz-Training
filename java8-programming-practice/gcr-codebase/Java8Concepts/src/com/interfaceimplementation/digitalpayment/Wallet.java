package com.interfaceimplementation.digitalpayment;

class Wallet implements Payment{

    @Override
    public void pay(double amount){
        System.out.println("Paid Rs. " + amount + " using Wallet");
    }
}