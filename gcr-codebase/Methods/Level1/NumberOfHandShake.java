// Program to find maximun number of handshakes

import java.util.Scanner;

public class NumberOfHandShake{

     // Create method to find number of handshakes
	 public int numberOfHandShakes(int number)
	 { int handShake=(number*(number-1))/2;
	 return handShake;
	 }
	 
	// Main method
    public static void main(String[] args){
    // Create scanner object
    Scanner sc=new Scanner(System.in);
    
    // Take input from user
	System.out.print("Enter number od students: ");
    int numberOfStudents=sc.nextInt();	
	
	// Create object to call the method
	NumberOfHandShake hand=new NumberOfHandShake();
	
	// Calculate number of hand shake
	int handShake=hand.numberOfHandShakes(numberOfStudents);
	
	// Displaying number of hand shakes
	System.out.println(" The number of possible hand shakes is "+handShake);
	
	// Closing scanner stream
	sc.close();
    }
  }