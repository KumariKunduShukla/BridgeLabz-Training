package com.inheritance.employee;

//Intern class extending Employee
public class Intern extends Employee {

 // Unique attribute for Intern
 private int durationInMonths;

 // Constructor calling superclass constructor
 public Intern(String name, int id, double salary, int durationInMonths) {
     super(name, id, salary);
     this.durationInMonths = durationInMonths;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Internship Duration (Months): " + durationInMonths);
 }
}
