package com.inheritance.employee;

//Developer class extending Employee
public class Developer extends Employee {

 // Unique attribute for Developer
 private String programmingLanguage;

 // Constructor calling superclass constructor
 public Developer(String name, int id, double salary, String programmingLanguage) {
     super(name, id, salary);
     this.programmingLanguage = programmingLanguage;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Programming Language: " + programmingLanguage);
 }
}
