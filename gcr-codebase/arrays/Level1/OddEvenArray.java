// Created Class to store odd and even numbers into separate arrays
import java.util.Scanner;

public class OddEvenArray{
    public static void main(String[] args){
	// Create Scanner object
	    Scanner input= new Scanner(System.in);

        // Get integer input and check for Natural Number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number");
            System.exit(0);
        }

        // Create arrays for odd and even numbers
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        int oddIndex = 0;
        int evenIndex = 0;

        // Store odd and even numbers
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print odd and even numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        
		// Closing Scanner stream
        input.close();
    }
}
