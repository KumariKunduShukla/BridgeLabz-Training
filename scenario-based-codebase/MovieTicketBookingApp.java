// Program of Movie Ticket Booking App
import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char continueBooking='y';

        do {
            int ticketPrice = 0;
            int snackPrice = 0;

            // Movie type
            System.out.println("Select Movie Type:");
            System.out.println("1. Regular");
            System.out.println("2. 3D");
            System.out.println("3. IMAX");
            int movieType = sc.nextInt();

            switch (movieType) {
                case 1:
                    ticketPrice = 150;
                    break;
                case 2:
                    ticketPrice = 200;
                    break;
                case 3:
                    ticketPrice = 300;
                    break;
                default:
                    System.out.println("Invalid movie type!");
                    continue;
            }

            // Seat type
            System.out.println("Select Seat Type (gold/silver):");
            String seatType = sc.next();

            if (seatType.equalsIgnoreCase("gold")) {
                ticketPrice = ticketPrice + 100;
            } else if (seatType.equalsIgnoreCase("silver")) {
                ticketPrice = ticketPrice + 50;
            } else {
                System.out.println("Invalid seat type!");
                continue;
            }

            // Snacks
            System.out.println("Do you want snacks? (yes/no)");
            String snacks = sc.next();

            if (snacks.equalsIgnoreCase("yes")) {
                snackPrice = 80;
            }

            // Final bill
            int totalAmount = ticketPrice + snackPrice;

            System.out.println("----- BILL DETAILS -----");
            System.out.println("Ticket Price : "+ticketPrice);
            System.out.println("Snack Price  : "+snackPrice);
            System.out.println("Total Amount : "+totalAmount);
            System.out.println("------------------------");

            // Next customer
            System.out.println("Next customer? (yes/no)");
            continueBooking = sc.next().charAt(0);

        } while (continueBooking == 'y' || continueBooking == 'Y');

        sc.close();
        System.out.println(" Thank you for booking! ");

    }
}
