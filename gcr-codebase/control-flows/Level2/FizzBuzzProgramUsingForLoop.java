// Create Fizz Buzz Program Class using for loop
import java.util.Scanner;

public class FizzBuzzProgramUsingForLoop{
   public static void main(String[] args){
   // Create Scanner object
   Scanner sc = new Scanner(System.in);
   
   // Take input from user
   System.out.print("Enter a number: ");
   int number=sc.nextInt();
   
   //check for positive number and all conditions
   if(number<=0){
   System.out.println("Number is a negative number");
   }
   else{
    for(int i=1;i<=number;i++){
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
   }
  }
  
  //Closing Scanner Stream
  sc.close();
  }
 }