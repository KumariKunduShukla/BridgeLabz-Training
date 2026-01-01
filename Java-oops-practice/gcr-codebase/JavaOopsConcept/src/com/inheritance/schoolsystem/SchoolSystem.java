package com.inheritance.schoolsystem;

public class SchoolSystem {
	public static void main(String[] args) {

        Teacher teacher = new Teacher("Anita", 35, "Mathematics");
        Student student = new Student("Rohit", 16, "10th Grade");
        Staff staff = new Staff("Suresh", 45, "Administration");

        teacher.displayRole();
        System.out.println("----------------------");

        student.displayRole();
        System.out.println("----------------------");

        staff.displayRole();
    }
}