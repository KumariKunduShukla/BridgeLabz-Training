// Create Class to calculate the sum of numbers using array
import java.util.Scanner;

public class SumOfNumberUsingArray{
    public static void main(String[] args){
	//Create Scanner object
	Scanner scanner = new Scanner(System.in);
	
	
	// Declare array, total, and index
    double[] numbers = new double[10];
    double total = 0.0;
    int index = 0;

        

    // Infinite while loop to take inputs
        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();

            // Break if input is 0 or negative and if when index is 10
            if (input <= 0) {
                break;
            }
            if (index == 10) {
                break;
            }
            numbers[index] = input;
            index++;
        }

    // Display stored numbers and calculate sum
        System.out.println("Stored Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total = total + numbers[i];
        }

    // Display total
        System.out.println("Sum of all numbers = " + total);
    
	// Closing Scanner stream
        scanner.close();
    }
}