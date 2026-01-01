package com.inheritance.animal;

//Bird is a subclass of Animal
public class Bird extends Animal {

 // Constructor calling superclass constructor
 public Bird(String name, int age) {
     super(name, age);
 }

 // Overriding makeSound() method
 @Override
 public void makeSound() {
     System.out.println(name + " says: Chirp Chirp!");
 }
}