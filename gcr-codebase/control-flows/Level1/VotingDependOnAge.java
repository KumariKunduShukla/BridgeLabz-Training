// Create Voting depend on age Class to check whether a person can vote or not
import java.util.Scanner;

public class VotingDependOnAge{
   public static void main(String[] args){
    // Create a Scanner Object
    Scanner input=new Scanner(System.in);
	   
	// Get input value for age
	System.out.print("Enter the persons's age: ");
	int age=input.nextInt();
	   
	// Checking and printing whether a person can vote or not
	if(age>=18){
	    System.out.println("The person's age is "+age+ " and can vote ");
    }
	else{
	    System.out.println("The person's age is "+age+ " and cannot vote ");
	}
	   
	//	Closing the Scanner Stream
    input.close();
		
	}
}	

	 
   