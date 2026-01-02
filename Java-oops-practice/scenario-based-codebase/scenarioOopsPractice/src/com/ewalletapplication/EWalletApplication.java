package com.ewalletapplication;

public class EWalletApplication {
	public static void main(String[] args) {

        User u1 = new User(1, "Rahul",
                new PersonalWallet(5000, 500)); // referral bonus

        User u2 = new User(2, "Anita",
                new BusinessWallet(20000));

        Transferable sender1 = (Transferable) u1.getWallet();
        Transferable sender2 = (Transferable) u2.getWallet();

        sender1.transferTo(u2, 3000);
        sender2.transferTo(u1, 5000);
        

        System.out.println("Rahul Balance: ₹" + u1.getWallet().getBalance());
        System.out.println("Anita Balance: ₹" + u2.getWallet().getBalance());
    }
}
