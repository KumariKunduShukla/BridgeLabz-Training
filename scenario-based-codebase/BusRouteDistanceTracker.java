// Program of bus route distance tracker
import java.util.Scanner;

public class BusRouteDistanceTracker {

    public static void main(String[] args) {
	    // Create scanner object
	    Scanner sc = new Scanner(System.in);

        int totalDistance = 0;
        int stopNumber = 1;
        char choice = 'n';
        
		// Loop until passenger decide to get off
        while (true) {

            System.out.print("Enter distance added at Stop " + stopNumber + " (in km): ");
            int distance = sc.nextInt();

            totalDistance = totalDistance + distance;

            System.out.println("Total distance covered: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (y/n): ");
            choice = sc.next().charAt(0);

            if (choice == 'y' || choice == 'Y') {
                System.out.println("Passenger got off.");
                break;
            }

            stopNumber++;
		}
		
		// Display the final distance travelled
		System.out.println(" Final distance travelled: " + totalDistance + " km");

       // Closing scanner stream
	   sc.close();
	   
	}
	   
}