// Create Check Number Class to check the number
import java.util.Scanner;

public class CheckNumberUsingArray{
    public static void main(String[] args){
	// Create Scanner Object
	Scanner input=new Scanner(System.in);
	
	//Declare the 1D Array
	System.out.print("Enter numbers: ");
	int[] numbers=new int[5];
	
	//Taking user input from the user for array elements
	for(int i=0;i<numbers.length;i++){
	numbers[i]=input.nextInt();}
	
	//Check each number for positive, negative and zero
	for(int i=0;i<numbers.length;i++){
	if(numbers[i]>0){
	 if(numbers[i]%2==0){
	  System.out.println("The "+numbers[i]+" is a positive even number. ");
	 }
	else{
	  System.out.println("The "+numbers[i]+" is a positive odd number. ");
	 }
	}
	else if(numbers[i]<0){
	System.out.println(" The "+numbers[i]+" is a negative number. ");
	}
	else{
	System.out.println(" The "+numbers[i]+" is zero. ");
	}
    }
	
	//Compare the first and last elements of the array
	int first=numbers[0];
	int last=numbers[4];
	
	//comparing first and last element
	if(first == last){
	System.out.println("Both the numbers are equal");
	}
	else if(first> last){
	System.out.println("First number is grater than last number");
	}
	else{
	System.out.println("First number is than last number.");
	}
	
	
	// Closing scanner stream
	input.close();
   }
 }
	
	
	