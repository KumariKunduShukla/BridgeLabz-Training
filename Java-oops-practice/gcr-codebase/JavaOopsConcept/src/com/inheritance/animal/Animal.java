package com.inheritance.animal;

public class Animal {
	// Instance variables (attributes)
    protected String name;
    protected int age;

    // Constructor to initialize Animal object
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}