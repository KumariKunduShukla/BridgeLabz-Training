// Create Sum of numbers Class to calcluate 
import java.util.Scanner;

public class SumOfNumbers{
   public static void main(String[] args){
   // Create a Scanner Object
   Scanner input=new Scanner(System.in);
   
   // Define variable and initialize 
   double total=0.0;
   double number;
   
   // Ask for first input
   System.out.print("Enter the number(0 to stop): ");
   number=input.nextDouble();
   
   //
   while(number != 0){
   total =total+number;
   
   // Ask for next input
   System.out.print("Enter a number (0 to stop): ");
        number = input.nextDouble();
        }

    // Display total
    System.out.println("Total sum = " + total);

        input.close();
 }
}
   