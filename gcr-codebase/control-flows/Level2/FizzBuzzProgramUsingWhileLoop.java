// Create Fizz Buzz Program Class using while loop
import java.util.Scanner;

public class FizzBuzzProgramUsingWhileLoop{
   public static void main(String[] args){
   // Create Scanner object
   Scanner sc = new Scanner(System.in);
   
   // Take input from user and intialize a variable i
   System.out.print("Enter a number: ");
   int number=sc.nextInt();
   int i=1;
   
   //check for positive number and all conditions
   if(number<=0){
   System.out.println("Number is a negative number");
   }
   else{
    while(i<=number){
    if(i%3==0 && i%5==0){
	System.out.println("FizzBuzz");
	}
	else if(i%3==0){
	 System.out.println("Fizz");
	}
	else if(i%5==0){
	 System.out.println("Buzz");
	}
	else{
	System.out.println(i);
	}
	i++;
   }
  }
  
  //Closing Scanner Stream
  sc.close();
  }
 }