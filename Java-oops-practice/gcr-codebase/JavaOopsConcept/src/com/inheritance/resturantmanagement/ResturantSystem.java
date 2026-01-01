package com.inheritance.resturantmanagement;

public class ResturantSystem {
	public static void main(String[] args) {

        // Creating Chef and Waiter objects
        Worker chef = new Chef("Raj", 101, "Italian");
        Worker waiter = new Waiter("Amit", 102, 5);

        // Calling interface methods 
        chef.performDuties();
        waiter.performDuties();
    }
}