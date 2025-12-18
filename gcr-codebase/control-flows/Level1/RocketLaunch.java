// Create Rocket Launch Class to count down the number
import java.util.Scanner;

public class RocketLaunch{
   public static void main(String[] args){
    // Create a Scanner Object
    Scanner input=new Scanner(System.in);
	
	// Get input value form user
	System.out.print("Enter the value: ");
	int counter=input.nextInt();
	
	//Using while loop and printing the value of the counter
	while(counter >= 1){
	System.out.println(counter);
	counter--;
	}
	
	// Closing the Scanner Stream
	input.close();
  }
}
  
