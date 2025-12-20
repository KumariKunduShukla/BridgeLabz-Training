// Program to calculate simple interest

import java.util.Scanner;

public class CalculateSimpleInterest{

    // Ctreating method simpleInterestCalculation to calculate simple interest
	public double simpleInterestCalculation(double principal, double rate, float time){
	double simpleInterest = (principal*rate*time)/100;
	return simpleInterest;
	}
	
    public static void main(String[] args){
	// Create scanner object
	Scanner sc=new Scanner(System.in);
	
	// Take user input
	System.out.println("Enter Principal:");
	double principal=sc.nextDouble();
	System.out.println("Enter Rate:");
	double rate=sc.nextDouble();
	System.out.println("Enter Time:");
	float time=sc.nextFloat();
	
	// Creating object of class to call method
    CalculateSimpleInterest simple=new CalculateSimpleInterest();	
	
	// Calculate simple interest using method
	double simpleInterest=simple.simpleInterestCalculation(principal, rate, time);
	
	//Printing simple interest
	System.out.println(" The Simple Interest is "+simpleInterest+" for Principal "+principal+" Rate of Interest "+rate+" and Time "+time);

   // Closinng scanner stream
   sc.close();
 }
}   
	