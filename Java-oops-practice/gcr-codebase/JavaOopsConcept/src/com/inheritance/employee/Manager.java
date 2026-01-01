package com.inheritance.employee;

//Manager class extending Employee
public class Manager extends Employee {

 // Unique attribute for Manager
 private int teamSize;

 // Constructor calling superclass constructor
 public Manager(String name, int id, double salary, int teamSize) {
     super(name, id, salary);
     this.teamSize = teamSize;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Team Size: " + teamSize);
 }
}
