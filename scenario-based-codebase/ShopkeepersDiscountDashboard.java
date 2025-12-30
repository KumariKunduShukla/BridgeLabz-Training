// Program for Shopkeepers Discount Dashboard
import java.util.Scanner;

public class ShopkeepersDiscountDashboard {

    // Constants for discount percentages
    private static final double DISCOUNT_10 = 0.10;
    private static final double DISCOUNT_20 = 0.20;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int itemCount = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] itemNames = new String[itemCount];
        double[] itemPrices = new double[itemCount];

        double totalBill = 0.0;

        // Input item details using for-loop
        for (int i = 0; i < itemCount; i++) {
            System.out.println("\nEnter details for Item " + (i + 1));

            System.out.print("Item Name: ");
            itemNames[i] = sc.nextLine();

            System.out.print("Item Price: ");
            itemPrices[i] = sc.nextDouble();
            sc.nextLine(); // consume newline

            totalBill =totalBill + itemPrices[i];
        }

        // Discount calculation using if-else
        double discount = 0.0;

        if (totalBill >= 500 && totalBill < 1000) {
            discount = totalBill * DISCOUNT_10;
        } 
        else if (totalBill >= 1000) {
            discount = totalBill * DISCOUNT_20;
        }

        double finalAmount = totalBill - discount;

        // Display bill
		System.out.println("\n--------BILL--------");
        System.out.println("Item Name   Price");
        System.out.println("----------------------------");

        // Loop to display items and prices
        for (int i = 0; i < itemCount; i++) {
         System.out.println(itemNames[i] + "  " + itemPrices[i]);
        }

        System.out.println("-------------------------------");
        System.out.println("Total Bill     : " + totalBill);
        System.out.println("Discount       : " + discount);
        System.out.println("Final Amount   : " + finalAmount);
        System.out.println("--------------------------------");
		
		
		// Closing scanner stream
		sc.close();
		
    }
}