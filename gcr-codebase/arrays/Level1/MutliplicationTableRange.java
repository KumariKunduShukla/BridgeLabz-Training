// Create Class to print multiplication table of number from 6 to 9
import java.util.Sacnner;

public class MutliplicationTableRange{
   public static void main(String[] args){
   // Create Scanner object to take user input
   Scanner sc=new Scanner(System.in);
   
   // Take integer input from the user
   System.out.print("Enter a number: ");
   int number = sc.nextInt();

   //  Create an integer array to store multiplication results(from 6 to 9)
    int[] result = new int[4];
		
   // Use for loop from 6 to 9 and store results in array
   int index = 0;
    for (int i = 6; i <= 9; i++){
      result[index] = number * i;
      index++;
     }
	
   // Display the multiplication table using the array
    System.out.println(" Multiplication Table of " + number + " (from 6 to 9):");
    index = 0;
    for (int i = 6; i <= 9; i++){
      System.out.println(number + " * " + i + " = " + result[index]);
      index++;
     }
   
   // Closing the Scanner Stream
   sc.close();
   }
  }
   