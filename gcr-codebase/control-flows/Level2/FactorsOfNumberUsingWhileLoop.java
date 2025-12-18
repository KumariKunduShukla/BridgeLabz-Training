// Create Factors of Number Class to check perfect divisiblility using while loop
import java.util.Scanner;
 
public class FactorsOfNumberUsingWhileLoop{
   public static void main(String[] args){
   // Create Scanner object
   Scanner sc=new Scanner(System.in);
   
   // Take input from user and initialize the variable i
   System.out.print("Enter number: ");
   int number=sc.nextInt();
   int i=1;
   
   // check for positive integer and check divisibility
   if(number<=0){
    System.out.println("Number is negative");
   }
   else{
    while(i<=number){
	 if(number%i==0){
	  System.out.println(i);
	  }
	  i++;
	 }
    }
	
	// Closing Scanner Stream
	sc.close();
  }
}
	 
   
    