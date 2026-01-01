// Program of festival lucky draw
import java.util.Scanner;   

public class FestivalLuckyDraw {
    public static void main(String[] args) {
	    // Create Scanner object  
        Scanner sc = new Scanner(System.in);  

        int visitors = 5;   

        // Loop for multiple visitors
        for (int i = 1; i <= visitors; i++) {

            System.out.print("Visitor " + i + ", draw a number: ");

            // Check if input is an integer
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Try next visitor.");
                sc.next();      
            }

            int number = sc.nextInt();  // Store drawn number

            // Check if number is divisible by both 3 and 5
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift.");
            } else {
                System.out.println(" Sorry, better luck next time.");
            }
        }
        
		// Closing scanner stream
        sc.close();  
    }
}
