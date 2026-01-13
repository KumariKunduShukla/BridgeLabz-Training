package com.trafficmanager;

import java.util.*;

public class TrafficManager {
	
	// Circular Linked List
    private Vehicle head = null;
    private Vehicle tail = null;

    // Queue for waiting vehicles
    private Queue<String> waitingQueue = new LinkedList<>();

    private int maxCapacity = 3;
    private int currentCount = 0;

    // Add vehicle to waiting queue
    void addToQueue(String vehicleNumber) {
        waitingQueue.offer(vehicleNumber);
        System.out.println("Vehicle " + vehicleNumber + " added to waiting queue.");
    }

    // Enter vehicle into roundabout
    void enterRoundabout() {
        if (currentCount == maxCapacity) {
            System.out.println(" Roundabout FULL. Cannot enter.");
            return;
        }

        if (waitingQueue.isEmpty()) {
            System.out.println(" No vehicles in queue.");
            return;
        }

        String vehicleNumber = waitingQueue.poll();
        Vehicle newVehicle = new Vehicle(vehicleNumber);

        if (head == null) {
            head = tail = newVehicle;
            tail.next = head;
        } else {
            tail.next = newVehicle;
            tail = newVehicle;
            tail.next = head;
        }

        currentCount++;
        System.out.println(" Vehicle " + vehicleNumber + " entered roundabout.");
    }

    // Remove vehicle from roundabout
    void exitRoundabout() {
        if (head == null) {
            System.out.println(" Roundabout EMPTY.");
            return;
        }

        System.out.println(" Vehicle " + head.number + " exited roundabout.");

        if (head == tail) {
            head = tail = null;
        } else {
            tail.next = head.next;
            head = head.next;
        }

        currentCount--;
    }

    // Print roundabout state
    void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        System.out.print(" Roundabout Vehicles: ");
        Vehicle temp = head;
        do {
            System.out.print(temp.number + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    // Print waiting queue
    void printQueue() {
        System.out.println(" Waiting Queue: " + waitingQueue);
    }
}