// Create Odd Even number Class using for loop
import java.util.Scanner;

public class OddEvenNumber{
   public static void main(String[] args){
   // Create a Scanner Object
   Scanner sc=new Scanner(System.in);
   
   // Take user input 
   System.out.print("Enter the number: ");
   int number=sc.nextInt();
   
   // Check if number is natural and also for even and odd as well print 
   if(number<=0){
	   System.out.println("Not a natural number");
    }
   
	for(int i=1;i<=number;i++){
	if(i%2==0){
	  System.out.println(i+" is an Even number");
	}
	else{
	  System.out.println(i+" is an Odd number");
	  }
	 }
    
   
   // Closing the Scanner Stream
    sc.close();
   }
 }