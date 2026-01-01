package com.inheritance.schoolsystem;

//Staff class inherits from Person
public class Staff extends Person {

   // Staff-specific attribute
   private String department;

   public Staff(String name, int age, String department) {
     super(name, age);
     this.department = department;
   }

   // Method describing staff role
   public void displayRole() {
     System.out.println("Role: Staff");
     displayBasicInfo();
     System.out.println("Department: " + department);
 }
}
