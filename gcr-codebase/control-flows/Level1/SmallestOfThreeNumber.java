// Create Smallest Of Three Number Class to find smallest number
import java.util.Scanner;

public class SmallestOfThreeNumber{
    public static void main(String[] args){
        // Create a Scanner Object
           Scanner input = new Scanner(System.in);

        // Get input value for three numbers
           int number1 = input.nextInt();
           int number2 = input.nextInt();
           int number3 = input.nextInt();

        // Print the result by comapring the numbers
	       System.out.println(" Is the first number the smallest? "+((number1<number2) && (number1<number3)));
	 
	    // Closing the Scanner Stream
	       input.close();
  }
}