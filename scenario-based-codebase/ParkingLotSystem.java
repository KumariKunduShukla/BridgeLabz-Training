// Program for parking lot system.

import java.util.Scanner;
 
public class ParkingLotSystem{
     public static void main(String[] args){
	   // Create scanner object
       Scanner sc=new Scanner(System.in);
	   
	   int totalSlot=7;
	   int occupiedSlot=0;
	   int choice;
	   
	  while(totalSlot!=0){
	  System.out.println("/n Parking lot menu");
	  System.out.println("1. Park Vehicle");
	  System.out.println("2. Exit vehicle");
	  System.out.println("3. Show occupacy");
	  System.out.println("4. System exit");
	  System.out.println(" Enter your choice");
	  choice=sc.nextInt();
	  switch(choice){
	  case 1:
	       if(occupiedSlot<totalSlot){
		     occupiedSlot++;
		     System.out.println("Vehicle parked successfully");
		   }
		   else{
		     System.out.println("Parking Lot is Full!");
		   }
		   break;
		   
	   case 2:
           if(occupiedSlot>0){
		     occupiedSlot--;
        	 System.out.println("Vehicle exit from praking successfully");	
            }
            else{
             System.out.println("Parking lot is already empty");
            }
            break;
	   case 3:
            System.out.println("Occupied Slot:"	+ occupiedSlot);
            System.out.println("Available slot:"+(totalSlot-occupiedSlot));
            break;
	   case 4:
		    System.out.println("Existing the system. Thank you!");
			return;
	   default:
            System.out.println("Invalid choice. Please try again");
        }
		// Stop if parking is full
		if(occupiedSlot==totalSlot){
		System.out.println("\nParking lot is full. No more vehicles allowed.");
		break;
		}
		}
		
		// Closing scanner stream
		sc.close();
 }
}
		
       	   