// Program to calculate the mean height of players in a football team
import java.util.Scanner;

public class CalculateMeanHeight{
    public static void main(String[] args) {
	// Create Scanner object
	    Scanner sc = new Scanner(System.in);

        // Create a double type array of size 11
        double[] heights = new double[11];

        double sum = 0.0;

        // Take input from user
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // Find the sum of all elements and calculate mean 
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        double mean = sum / heights.length;

        System.out.println(" Mean height of the football team: " + mean);
        
		// Closing scanner stream
        sc.close();
    }
}
