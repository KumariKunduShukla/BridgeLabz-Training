// Create VotingEligibility Class to check the eligiblity of students
import java.util.Scanner;

public class VotingEligibility{
    public static void main(String[] args){
	// Create Scanner Object
	Scanner input=new Scanner(System.in);
	
	//Declare the 1D Array
	System.out.print("Enter students's age: ");
	int[] age=new int[10];
	
	//Taking user input from the user for array elements
	for(int i=0;i<age.length;i++){
	age[i]=input.nextInt();}
	
	//Displaying whether one can vote or not
	for(int i=0;i<age.length;i++){
	if( age[i]<0 ){
	System.err.println("Invalid Age");
            System.exit(0);
     }
	 else if(age[i]>=18){
	 System.out.println(" The student with the age "+age[i]+" can vote. ");
	 }
	 else{
	 System.out.println("The student with the age "+age[i]+" cannot vote.");
	 }
	}
	
	// Closing Scanner Stream
	input.close();
	}
   }

	 
	
  