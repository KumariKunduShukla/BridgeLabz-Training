// Create Age and Height Class to find the age and height
import java.util.Scanner;

public class AgeAndHeight{
    public static void main(String[] args){
	// Create Scanner object
	Scanner sc=new Scanner(System.in);
	
	// Take input from user for friends age and height
	System.out.print("Enter age: ");
	int amarAge = sc.nextInt();
	int akbarAge = sc.nextInt();
	int anthonyAge = sc.nextInt();
	System.out.print("Enter height :");
	double amarHeight = sc.nextDouble();
	double akbarHeight = sc.nextDouble();
	double anthonyHeight = sc.nextDouble();
	
	// find youngest friend
	if((amarAge<=akbarAge) && (amarAge<=anthonyAge)){
	 System.out.println("Amar is the youngest");
	}
	else if((akbarAge<=amarAge) && (akbarAge<=anthonyAge)){
	 System.out.println("Akbar is the youngest");
	}
	 else{
	  System.out.println("Anthony is the youngest");
	}
	
    // find tallest friends
    if((amarHeight>=akbarHeight) && (amarHeight>=anthonyHeight)){
	 System.out.println("Amar is the tallest");
	}
	else if((akbarHeight>=amarHeight) && (akbarHeight>=anthonyHeight)){
	 System.out.println("Akbar is the tallest");
	}
	else{
	 System.out.println("Anthony is the tallest");
	}
	
	// Closing Scanner Stream
	sc.close();
  }
}