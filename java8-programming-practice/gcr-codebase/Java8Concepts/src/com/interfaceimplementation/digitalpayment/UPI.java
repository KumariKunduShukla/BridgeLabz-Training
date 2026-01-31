package com.interfaceimplementation.digitalpayment;

class UPI implements Payment{

    @Override
    public void pay(double amount){
        System.out.println("Paid Rs. " + amount + " using UPI");
    }
}