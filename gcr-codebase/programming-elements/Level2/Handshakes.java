// Program to find maximum number of handshakes
import java.util.Scanner;

public class Handshakes{  
public static void main(String[] args){
//declare variables
int numberOfStudents;

Scanner input = new Scanner(System.in); //Scanner object
numberOfStudents = input.nextInt(); //taking number of students input
        
int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2; //calculating handshakes
System.out.println("The maximum number of handshakes possible is " + handshakes); //Display the result
    }
}