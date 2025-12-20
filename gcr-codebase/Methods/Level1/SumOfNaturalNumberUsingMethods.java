// Program to find the sum of N narural numbers

import java.util.Scanner;

public class SumOfNaturalNumberUsingMethods{
    
	// Creating method to calculate sum
	public static int calculateSum(int number){
		int sum=0;
	for(int i=1;i<=number;i++){
	 sum=sum+i;
	}
	return sum;
	}
	
	// Main method
	public static void main(String[] args){
	// Create scanner object
	Scanner input=new Scanner(System.in);
	
	// Take user input
	System.out.print("Enter the number: ");
	int number=input.nextInt();
	
	// Displaying sum using method
	System.out.println(calculateSum(number));
	
	// Closing scanner stream
	input.close();
	}
   }