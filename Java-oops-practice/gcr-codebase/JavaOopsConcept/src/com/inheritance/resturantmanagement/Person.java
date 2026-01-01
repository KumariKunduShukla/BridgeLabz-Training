package com.inheritance.resturantmanagement;

public class Person {
	// Common attributes
    protected String name;
    protected int id;

    // Constructor to initialize person details
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display basic person information
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}