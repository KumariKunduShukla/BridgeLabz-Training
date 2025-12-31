// Program of phone recharge simulator

import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String[] args) {
        
		// Create scanner object
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        char choice;

        do {
            System.out.print("\nEnter mobile operator (Airtel / Jio / Reliance): ");
            String operator = sc.next();

            System.out.print("Enter recharge amount: ");
            double amount = sc.nextDouble();

            balance += amount;

            System.out.println("\n--- Recharge Offer Details ---");

            switch (operator.toLowerCase()) {

                case "airtel":
                    System.out.println("Airtel Offer: 1.5GB/day for 28 days");
                    break;

                case "jio":
                    System.out.println("Jio Offer: 2GB/day + Unlimited Calls");
                    break;

                case "reliance":
                    System.out.println("Reliance Offer: Weekend Data Rollover");
                    break;

                default:
                    System.out.println("Invalid operator selected");
            }
            
			// Display recharge amount and balace
            System.out.println("Recharge Amount: "+ amount);
            System.out.println("Updated Balance: "+ balance);
      
            System.out.print("\nDo you want to recharge again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Phone Recharge Simulator");
		
		// Closing scanner stream
        sc.close();
    }
}
