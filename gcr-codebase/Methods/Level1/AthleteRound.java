// Program to find how many number of rounds must athlete needs to complete

import java.util.Scanner;

public class AthleteRound{

     // Create method to find number of rounds
	 public double calculateNumberOfRounds(double distance, double perimeter){
	 double numberOfRound=distance/perimeter;
	 return numberOfRound;
	 }
	 
	// Main method
    public static void main(String[] args){
    // Create scanner object
    Scanner sc=new Scanner(System.in);
    
    // Take input from user
	System.out.print("Enter first side: ");
    double firstSide=sc.nextDouble();
	System.out.print("Enter second side: ");
    double secondSide=sc.nextDouble();
	System.out.print("Enter third side: ");
    double thirdSide=sc.nextDouble();
    	
	
	// Create object to call the method
	AthleteRound rounds=new AthleteRound();
	
	// Calculate perimeter and total distance
	double perimeter=(firstSide+secondSide+thirdSide);
	double distanceInKm=5;
	double distanceInM=distanceInKm*1000;
	
	// Calculate number of total rounds usig method
	double numberOfRound=rounds.calculateNumberOfRounds(distanceInM, perimeter);
	
	
	// Displaying number of hand shakes
	System.out.println(" The total rounds are "+numberOfRound);
	
	// Closing scanner stream
	sc.close();
    }
  }