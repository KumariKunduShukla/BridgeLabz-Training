// Create Multiplication Table Class to print table from 6 to 9
import java.util.Scanner;

public class MultiplicationTableSixToNine{
   public static void main(String[] args){
   // Create Scanner object
   Scanner sc=new Scanner(System.in);
   
   //Take input from user
   System.out.print("Enter a number: ");
   int number=sc.nextInt();
   
   // Printing multiplication table from 6 to 9
   for(int i=6;i<=9;i++){
     System.out.println(number+ "*" +i+" = "+(number*i));
	 }
   // Closing Scanner Stream
   sc.close();
  }
 }
   
