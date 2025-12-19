/// Create Class to print multiplication table of number
import java.util.Scanner;

public class MultiplicationTableUsingArray{
    public static void main(String[] args){
	// Create Scanner Object
	Scanner input=new Scanner(System.in);
	
	//Declare the 1D Array
	System.out.print("Enter a number: ");
	int number=input.nextInt();
	
	//Declare an integer array to store multiplication results (1 to 10)
	int[] table=new int[10];
	
	//Store multiplication results in the array
	for(int i=1;i<=table.length;i++){
	table[i-1]=number*i;
	}
	
	//Display the multiplication table
	System.out.println(" Multiplication Table of " + number + ":");
	for(int i=1;i<=table.length;i++){
	 System.out.println(number + " * " + i + " = " + table[i-1]);
	 }
	 
	 // Closing the scanner stream
	 input.close();
	 }
	}
	
	