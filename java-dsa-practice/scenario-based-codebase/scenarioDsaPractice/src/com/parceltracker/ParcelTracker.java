package com.parceltracker;

public class ParcelTracker {
	 private Node head;

     // Add stage at end
     public void addStage(String stage) {
        Node newNode = new Node(stage);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

     // Add intermediate checkpoint
     public void addCheckpointAfter(String existingStage, String newStage) {
        if (head == null) {
            System.out.println("Parcel not found.");
            return;
        }

        Node temp = head;
        while (temp != null && !temp.stage.equals(existingStage)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Stage '" + existingStage + "' not found.");
            return;
        }

        Node newNode = new Node(newStage);
        newNode.next = temp.next;
        temp.next = newNode;
    }

     // Forward tracking
     public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel is lost or not registered.");
            return;
        }

        Node temp = head;
        System.out.print("Tracking Status: ");

        while (temp != null) {
            System.out.print(temp.stage);
            if (temp.next != null) {
                System.out.print(" → ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

     // Handle lost parcel
     public void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as lost.");
    }
}