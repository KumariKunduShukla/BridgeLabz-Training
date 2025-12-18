// Create Check Number Class to check wheteher a number is positive, negative or zero
import java.util.Scanner;
 
public class CheckNumber{
  public static void main(String[] args){
    // Create a Scanner Object
	Scanner input=new Scanner(System.in);
	
	// Get input value for number
	System.out.print("Enter the number: ");
    int number=input.nextInt();
	
	// Check number is positive, negative or zero and print
	if(number>0){
	System.out.println("The number is positive");
	}
	else if(number<0){
	System.out.println("The number is negative");
	}
	else{
	System.out.println("The number is zero");
	}
	
	// Closing the Scanner Stream
    input.close();
  }
}
  