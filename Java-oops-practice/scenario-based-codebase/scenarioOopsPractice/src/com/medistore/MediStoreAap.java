package com.medistore;

import java.time.LocalDate;
import java.util.Scanner;

public class MediStoreAap {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Medicine Type (1-Tablet, 2-Syrup, 3-Injection): ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Medicine Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        LocalDate expiry = LocalDate.parse(sc.next());

        Medicine medicine = null;

        switch (choice) {
            case 1:
                medicine = new Tablet(name, price, expiry, qty);
                break;
            case 2:
                medicine = new Syrup(name, price, expiry, qty);
                break;
            case 3:
                medicine = new Injection(name, price, expiry, qty);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        System.out.println("\n--- Medicine Details ---");
        medicine.display();

        medicine.checkExpiry();

        System.out.print("\nEnter quantity to sell: ");
        int sellQty = sc.nextInt();

        medicine.sell(sellQty);

        sc.close();
    }
}