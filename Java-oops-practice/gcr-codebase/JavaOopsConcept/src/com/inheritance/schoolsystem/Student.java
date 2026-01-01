package com.inheritance.schoolsystem;

//Student class inherits from Person
public class Student extends Person {

  // Student-specific attribute
  private String grade;

  public Student(String name, int age, String grade) {
     super(name, age);
     this.grade = grade;
 }

  // Method describing student role
  public void displayRole() {
     System.out.println("Role: Student");
     displayBasicInfo();
     System.out.println("Grade: " + grade);
 }
}
