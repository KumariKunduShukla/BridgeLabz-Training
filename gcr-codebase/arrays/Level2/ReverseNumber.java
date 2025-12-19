// Program to reverse the number
import java.util.Scanner;

public class ReverseNumber{
   public static void main(String[] args){
   // Create Scanner object
   Scanner sc=new Scanner(System.in);
   
   // Take user input
   System.out.print("Enter a number: ");
   int number=sc.nextInt();
   
   // Initialize a variable
   int tempNumber=number;
   int digitCount=0;
   
   // Find the count of digits in the number
   while(tempNumber>0){
   digitCount++;
   tempNumber=tempNumber/10;
   }
   
   // Create an array to store digits
   int[] digit=new int[digitCount];
   tempNumber=number;
   
   // Extract digits and store them in the array
   for (int index = digitCount-1; index>=0; index--) {
            digit[index] = tempNumber%10;
            tempNumber = tempNumber/10;
        }
		
	// Create another array to store digits in reverse order	
	int[] reversedDigit=new int[digitCount];

        for (int index = 0; index < digitCount; index++) {
            reversedDigit[index] = digit[digitCount - 1 - index];
        }	
		
	// Display the reversed number
    System.out.print("Reversed number: ");
        for (int index = 0; index < digitCount; index++) {
            System.out.print(reversedDigit[index]);
        }
    
    sc.close();
   }
  }