// Create Class to calculate the power of number using while loop
import java.util.Scanner;

public class PowerOfNumberUsingWhileLoop{
   public static void main(String[] args){
   // Create Scanner object
   Scanner sc = new Scanner(System.in);
   
   // Take input from user
   System.out.print("Enter the number: ");
   int number = sc.nextInt();
   System.out.print("Enter the power: ");
   int power = sc.nextInt();
   
   // Initialize result
   int result=1;
   int counter=1;
   
   // Chcek for positive integer and calculate result
   if((number<0) && (power<0)){
   System.out.println("Invalid input");
   }
   
   // Using for loop to calculate power
   while(counter<=power){
    result=result*number;
	counter++;
	}
	
	// Display the result
	System.out.println(number+" raised to the power "+power+ " is "+result);
	
	// Closing Scanner Stream
	sc.close();
	}
  }
   