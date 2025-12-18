// Create Class to find multiples below 100 using while loop
import java.util.Scanner;

public class MultiplesBelowHundredWhileLoop{
   public static void main(String[] args){
   // Create Scanner object
   Scanner input = new Scanner(System.in);
   
   // Take input from user
   System.out.print("Enter a number: ");
   int number = input.nextInt();
   
   // Initialize counter
   int counter=100;
   
   // Check valid input
   if((number<=0) && (number>=100)){
   System.out.println("Invalid input");
   }
   
    while(counter>=1){
	 
	 // check divisibility
	 if(counter%number == 0){
	 System.out.println(counter);
	 }
	 counter--;
	}
	
	// Closing Scanner Stream
	input.close();
   }
 }
 