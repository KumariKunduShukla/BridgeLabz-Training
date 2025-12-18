// Create Class to find multiples below 100 
import java.util.Scanner;

public class MultiplesBelowHundred{
   public static void main(String[] args){
   // Create Scanner object
   Scanner input = new Scanner(System.in);
   
   // Take input from user
   System.out.print("Enter a number: ");
   int number = input.nextInt();
   
   // Check valid input
   if((number<=0) && (number>=100)){
   System.out.println("Invalid input");
   }
   
    for(int i=100;i>=1;i--){
	 
	 // check divisibility
	 if(i%number == 0){
	 System.out.println(i);
	 }
	}
	
	// Closing Scanner Stream
	input.close();
   }
 }
 