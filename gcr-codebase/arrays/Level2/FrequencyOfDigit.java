// Program to find the frequency of digit
import java.util.Scanner;

public class FrequencyOfDigit{
    public static void main(String[] args){
	    // Create scanner object
        Scanner sc=new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;

        // Array to store digits of the number and frequency of each digit 
        int[] digits = new int[10]; 
        int[] frequency = new int[10];

        // Extract digits and store in digits array
        int count = 0;
        while (temp > 0){
            digits[count]=temp % 10;
            temp=temp / 10;
            count++;
        }

        // Find frequency of each digit
        for (int i = 0; i < count; i++){
            int digit = digits[i];
            frequency[digit]++;
        }

        // Display frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
        // Closing scanner stream
        sc.close();
    }
}