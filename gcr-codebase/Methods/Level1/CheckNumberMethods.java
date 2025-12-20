// Program to check whether a number is positive, negative or zero

import java.util.Scanner;

public class CheckNumberMethods{

      // Creating methods to check the number
	  public int checkingNumber(int number){
	  if(number>0){
	  return 1;
	  }
	  else if(number<0){
	  return -1;
	  }
	  else{
	  return 0;
	  }
	 }
	  
	  
      public static void main(String[] args){
	  // Create scanner object
	  Scanner sc=new Scanner(System.in);
	  
	  // Take user input
	  System.out.println("Enter the number: ");
	  int number=sc.nextInt();
	  
	  // Create class object 
	  CheckNumberMethods check=new CheckNumberMethods();
	  
	  // calling method using object
	  int checkNumber=check.checkingNumber(number);
	  
	  // Displaying the result
	  System.out.println(checkNumber);
	  
	  sc.close();
	  }
	 }