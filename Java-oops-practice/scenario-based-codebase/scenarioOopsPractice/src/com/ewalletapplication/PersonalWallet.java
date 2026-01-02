package com.ewalletapplication;

class PersonalWallet extends Wallet implements Transferable {

    private double transferLimit = 10000;

    PersonalWallet(double balance) {
        super(balance);
    }

    PersonalWallet(double balance, double referralBonus) {
        super(balance, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        if (amount > transferLimit) {
            System.out.println("Transfer limit exceeded for Personal Wallet");
            return;
        }

        if (deductMoney(amount)) {
            receiver.getWallet().addMoney(amount);
            System.out.println("Transferred ₹" + amount + " to " + receiver.getName());
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
