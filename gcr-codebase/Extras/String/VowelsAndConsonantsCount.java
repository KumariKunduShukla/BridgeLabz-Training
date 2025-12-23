// Java program to count the number of vowels and consonants
import java.util.Scanner;

public class VowelsAndConsonantsCount{
  
        public static void main(String[] args) {
		
        // Create scanner object and take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
		// Initialize and declare the variables
        int vowels = 0;
        int consonants = 0;
		
        // Converting to lower case
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check for vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check for consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        
		// Displaying the result
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        
		// Closing scanner stream
        sc.close();
    }
}