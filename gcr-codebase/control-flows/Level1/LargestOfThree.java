// Create Largest of three number Class to find the largest number
import java.util.Scanner;
public class LargestOfThree{
   public static void main(String[] args){
    // Create a Scanner Object
       Scanner input=new Scanner(System.in);
	  
    // Get input value for number
	   int number1 = input.nextInt();
       int number2 = input.nextInt();
       int number3 = input.nextInt();
	 
    // Print the result by comapring the numbers	 
       System.out.println("Is the first number the largest? "+((number1>number2) && (number1>number3)));
	   System.out.println("Is the second number the largest? "+((number2>number1) && (number2>number3)));
	   System.out.println("Is the third number the largest? "+((number3>number1) && (number3>number2)));
	   
	// Closing the Scanner Stream
	   input.close();
	   
	}
}	
	  