// Create Factors of Number Class to check perfect divisiblility
import java.util.Scanner;

public class FactorsOfNumber{
   public static void main(String[] args){
   // Create Scanner object
   Scanner sc=new Scanner(System.in);
   
   // Take input from user
   System.out.print("Enter number: ");
   int number=sc.nextInt();
   
   // check for positive integer and check divisibility
   if(number<=0){
    System.out.println("Number is negative");
   }
   else{
    for(int i=1;i<=number;i++){
	 if(number%i==0){
	  System.out.println(i);
	  }
	 }
    }
	
	// Closing Scanner Stream
	sc.close();
  }
}
	 
   
   