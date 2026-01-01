package com.inheritance.animal;

//Cat is a subclass of Animal
public class Cat extends Animal {

 // Constructor calling superclass constructor
 public Cat(String name, int age) {
     super(name, age);
 }

 // Overriding makeSound() method
 @Override
 public void makeSound() {
     System.out.println(name + " says: Meow Meow!");
 }
}