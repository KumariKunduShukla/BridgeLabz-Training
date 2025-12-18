//Create Sum until Zero Or Negative Class to calculate
import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Initialize total
        double total = 0.0;

        while (true) {
           // Take user input
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();

            // Check for stop condition
            if (number <= 0) {
                break;
            }

            // Add to total
            total = total+number;
        }

        // Display total
        System.out.println("Total sum = " + total);

        //Closing Scanner stream.
        input.close();
    }
}