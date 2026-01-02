package com.ewalletapplication;

class BusinessWallet extends Wallet implements Transferable {

    private double taxRate = 0.02; // 2% transaction tax

    BusinessWallet(double balance) {
        super(balance);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        double tax = amount * taxRate;
        double totalDeduction = amount + tax;

        if (deductMoney(totalDeduction)) {
            receiver.getWallet().addMoney(amount);
            System.out.println("Business transfer ₹" + amount +
                               " (Tax: ₹" + tax + ")");
        } else {
            System.out.println("Insufficient balance for business transfer");
        }
    }
}
