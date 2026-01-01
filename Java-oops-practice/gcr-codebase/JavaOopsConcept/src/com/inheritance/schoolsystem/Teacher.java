package com.inheritance.schoolsystem;

//Teacher class inherits from Person
public class Teacher extends Person {

   // Teacher-specific attribute
   private String subject;

   public Teacher(String name, int age, String subject) {
     super(name, age);
     this.subject = subject;
 }

   // Method describing teacher role
   public void displayRole() {
     System.out.println("Role: Teacher");
     displayBasicInfo();
     System.out.println("Subject: " + subject);
 }
}
