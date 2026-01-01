package com.inheritance.schoolsystem;

public class Person {
	// Common attributes for all roles
    protected String name;
    protected int age;

    // Constructor to initialize common details
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic person details
    public void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}