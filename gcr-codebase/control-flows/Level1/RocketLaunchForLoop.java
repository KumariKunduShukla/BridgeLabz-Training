// Create Rocket Launch for loop Class to count down the number
import java.util.Scanner;

public class RocketLaunchForLoop{
   public static void main(String[] args){
    // Create a Scanner Object
    Scanner input=new Scanner(System.in);
	
	// Get input value form user
	System.out.print("Enter the value: ");
	int start=input.nextInt();
	
	//Using for loop and printing the value of the counter
	for(int counter=start;counter>=1;counter--){
	System.out.println(counter);
	}
	
	// Closing the Scanner Stream
	input.close();
  }
}