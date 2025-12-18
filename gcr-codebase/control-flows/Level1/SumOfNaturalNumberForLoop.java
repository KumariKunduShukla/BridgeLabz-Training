// Create Sum Of Natural Numbers Class using for loop
import java.util.Scanner;

public class SumOfNaturalNumberForLoop{
   public static void main(String[] args){
   // Create a Scanner Object
   Scanner sc=new Scanner(System.in);
   
   // Take user input and initialize variable
   System.out.print("Enter the number: ");
   int number=sc.nextInt();
   int sumWithoutFormula=0;
   int sumWithFormula=0;
 
   // Check whether the number is natural and find sum using while loop
   if(number>0){
    for(int start=1;start<=number;start++){
	 sumWithoutFormula=sumWithoutFormula+ start;
	}
	
	// Calculate sum using formula
	sumWithFormula=number*(number+1)/2;
	
	// Comparing the result and printing it
	if(sumWithoutFormula == sumWithFormula){
	  System.out.println("Both computations are correct");
	}
	else{
      System.out.println("Both computations are not correct");
    }	
   }
	
    // Closing the Scanner Stream
    sc.close();
   }
 }