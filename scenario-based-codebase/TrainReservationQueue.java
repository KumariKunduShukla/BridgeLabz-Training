// Program of train reservation queue

import java.util.Scanner;

public class TrainReservationQueue{
   public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   
   int totalSlots=10;
   int occupiedSlots=0;
   int choice;
   
   System.out.println("Welcome to Ticket Reservation Portal");
   System.out.println("-------------------------------------");
   while(occupiedSlots<totalSlots){
   System.out.println("\n 1. Book Ticket");
   System.out.println("\n 2. Cancel Ticket");
   System.out.println("\n 3. Available Ticket");
   System.out.println("Enter your choice:");
   choice=sc.nextInt();
   switch(choice){
   
   case 1:
     if(occupiedSlots<totalSlots){
	 occupiedSlots++;
	 System.out.println(" Ticket reserved successfully");
	 }
	 else{
	 System.out.println("Seat is alraedy full");
	 }
	 break;
	 case 2:
	 if(occupiedSlots>0){
	 occupiedSlots--;
	 System.out.println(" Ticket is cancelled ");
	 }
	 else{
	 System.out.println(" No available tickets ");
	 }
	 break;
	 case 3:
	 System.out.println("Available slots:"+ (totalSlots-occupiedSlots));
	 break;
	 default:
	 System.out.println("Invalid choice! Please try again");
	 break;
	 }
	 if(totalSlots==occupiedSlots){
	 System.out.println("Sorry! No available slots");
	 }
   }
	 
	// Closing scanner stream
	sc.close();
	}
}	
	 