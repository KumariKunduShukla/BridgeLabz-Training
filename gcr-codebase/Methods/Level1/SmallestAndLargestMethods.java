// Program to find smallest and largest number

import java.util.Scanner;

public class SmallestAndLargestMethods{
    
	//Method created to calculate the smallest and largest number
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
	int smallest=number1;
	int largest=number1;
	if(number2<smallest){
	smallest=number2;
	}
	if(number2>largest){
	largest=number2;
	}
	if(number3>largest){
	largest=number3;
	}
	return new int[]{smallest, largest};
	}
	

    // Main method
    public static void main(String[] args){
	// Create scanner object
	Scanner sc=new Scanner(System.in);
	
	// Take user input
	System.out.print("Enter the first number: ");
	int firstNumber=sc.nextInt();
	System.out.print("Enter the second number: ");
	int secondNumber=sc.nextInt();
	System.out.print("Enter the third number: ");
	int thirdNumber=sc.nextInt();
	
	int[] result=findSmallestAndLargest(firstNumber,secondNumber,thirdNumber);
	
	//Display the results
	System.out.println("Smallest number is: "+result[0]);
	System.out.println("Largest number is: "+result[1]);
	
	// Closing scanner stream
	sc.close();
	}
   }
	
	