// Create factorial of number Class using while loop
import java.util.Scanner;

public class FactorialOfNumber{
   public static void main(String[] args){
   // Create a Scanner Object
   Scanner sc=new Scanner(System.in);
   
   // Take user input and initialize variable
   System.out.print("Enter the number: ");
   int number=sc.nextInt();
   int factorial=1;
   int start=1;
   
   //compute factorial using while loop
   if(number>0){
   while(start<=number){
   factorial=factorial*start;
   start++;
   }
   
   //Printing the factorial
   System.out.println("Factorial of a "+number+" is "+factorial);
   }
	
    // Closing the Scanner Stream
    sc.close();
   }
 }