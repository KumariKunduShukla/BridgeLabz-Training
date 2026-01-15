package com.parceltracker;

import java.util.Scanner;

public class ParcelTrackerAap {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    ParcelTracker tracker = new ParcelTracker();

    int choice;

      do {
        System.out.println("\n--- Parcel Tracker Menu ---");
        System.out.println("1. Add Delivery Stage");
        System.out.println("2. Add Intermediate Checkpoint");
        System.out.println("3. Track Parcel");
        System.out.println("4. Mark Parcel as Lost");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        choice = sc.nextInt();
        sc.nextLine();
        
        switch (choice) {

            case 1:
                System.out.print("Enter stage name: ");
                String stage = sc.nextLine();
                tracker.addStage(stage);
                break;

            case 2:
                System.out.print("Enter existing stage: ");
                String existing = sc.nextLine();
                System.out.print("Enter new checkpoint stage: ");
                String newStage = sc.nextLine();
                tracker.addCheckpointAfter(existing, newStage);
                break;

            case 3:
                tracker.trackParcel();
                break;

            case 4:
                tracker.markParcelLost();
                break;

            case 5:
                System.out.println("Exiting Parcel Tracker.");
                break;

            default:
                System.out.println("Invalid choice!");
        }

    } while (choice != 5);

    sc.close();
  }
}