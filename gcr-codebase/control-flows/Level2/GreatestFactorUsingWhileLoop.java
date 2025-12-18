// Create greatest factor Class to find greatest factor using while loop
import java.util.Scanner;

public class GreatestFactorUsingWhileLoop{
    public static void main(String[] args){
	// Create Scanner object
     Scanner sc = new Scanner(System.in);
	 
	
	// Take input from user and initialize the variable greatestFactor
	System.out.print("Enter number: ");
	int number=sc.nextInt();
	int greatestFactor = 1;
	int counter= number-1;
	
	// Check divisibility using for loop
	while(counter>=1){
	 if(number%counter == 0){
	 greatestFactor=counter;
	 break;
	 }
	 counter--;
	}
    
	// Display the result
	 System.out.println("The greatest factor of " + number + " is "+greatestFactor);
   
    // Closing the Scanner Stream
	sc.close();
	}
  }