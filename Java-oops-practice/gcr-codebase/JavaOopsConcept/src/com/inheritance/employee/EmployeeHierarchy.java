package com.inheritance.employee;

public class EmployeeHierarchy {
	public static void main(String[] args) {

        // Employee reference for different employee types
        Employee manager = new Manager("Amit", 101, 90000, 12);
        Employee developer = new Developer("Neha", 102, 70000, "Java");
        Employee intern = new Intern("Rahul", 103, 15000, 21);

        // Display details of each employee
        manager.displayDetails();
        System.out.println("----------------------");

        developer.displayDetails();
        System.out.println("----------------------");

        intern.displayDetails();
    }
}