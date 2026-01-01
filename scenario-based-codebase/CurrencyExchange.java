// Program of Currency excahnge kiosk

import java.util.Scanner;

public class CurrencyExchange{
      public static void main(String[] args) {
        // Create scanner stream
        Scanner sc = new Scanner(System.in);
        
		// Take input from user
        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();
        
		// Choose an option for conversion 
        System.out.println("Convert to:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");
        System.out.println("4. JPY");

        System.out.print("Choose option (1-4): ");
        int choice = sc.nextInt();

        double result = 0;
        
		// Use switch case for conversion
        switch (choice) {

            case 1:
                result = inr * 0.012;
                System.out.println("Amount in USD: " + result);
                break;

            case 2:
                result = inr * 0.011;
                System.out.println("Amount in EUR: " + result);
                break;

            case 3:
                result = inr * 0.010;
                System.out.println("Amount in GBP: " + result);
                break;

            case 4:
                result = inr * 1.80;
                System.out.println("Amount in JPY: " + result);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        // Closing the scanner stream
        sc.close();
    }
}