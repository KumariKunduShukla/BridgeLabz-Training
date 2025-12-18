// Create DivisibleByFive Class to check the number is divisible by 5
import java.util.Scanner;

class DivisibleByFive{

public static void main(String[] args){
// Create a Scanner Object
Scanner input=new Scanner(System.in);

// Get the input value
System.out.print("Enter a number :");
int number=input.nextInt();

// Print the result by checking the divisibility
System.out.println("Is the number "+number+" divisible by 5? "+(number%5==0));

// Closing the Scanner Stream
input.close();
 }
}