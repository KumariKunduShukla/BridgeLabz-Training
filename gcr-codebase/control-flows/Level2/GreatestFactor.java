// Create greatest factor Class to find greatest factor
import java.util.Scanner;

public class GreatestFactor{
    public static void main(String[] args){
	// Create Scanner object
     Scanner sc = new Scanner(System.in);
	 
	
	// Take input from user and initialize the variable greatestFactor
	System.out.print("Enter number: ");
	int number=sc.nextInt();
	int greatestFactor = 1;
	
	// Check divisibility using for loop
	for(int i=number-1;i>=1;i--){
	 if(number%i == 0){
	 greatestFactor=i;
	 break;
	 }
	}
    
	// Display the result
	 System.out.println("The greatest factor of " + number + " is "+greatestFactor);
   
    // Closing the Scanner Stream
	sc.close();
	}
  }