package com.inheritance.animal;

public class AnimalHierarchy {
	public static void main(String[] args) {

        // Polymorphism: Animal reference holding different subclass objects
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Kitty", 2);
        Animal bird = new Bird("Tweety", 1);

        // Calling overridden methods
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}