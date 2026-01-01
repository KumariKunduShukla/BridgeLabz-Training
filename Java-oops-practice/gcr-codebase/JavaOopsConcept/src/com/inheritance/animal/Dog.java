package com.inheritance.animal;

//Dog is a subclass of Animal
public class Dog extends Animal {

 // Constructor calling superclass constructor
 public Dog(String name, int age) {
     super(name, age);
 }

 // Overriding makeSound() method
 @Override
 public void makeSound() {
     System.out.println(name + " says: Woof Woof!");
 }
}