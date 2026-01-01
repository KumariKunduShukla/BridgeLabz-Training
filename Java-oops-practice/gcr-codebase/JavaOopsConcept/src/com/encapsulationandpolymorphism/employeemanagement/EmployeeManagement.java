package com.encapsulationandpolymorphism.employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
	public static void main(String[] args) {

        // List of employees using Employee reference (Polymorphism)
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 =
                new FullTimeEmployee(101, "Amit", 50000);
        emp1.assignDepartment("IT");

        PartTimeEmployee emp2 =
                new PartTimeEmployee(102, "Neha", 500, 40);
        emp2.assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        // Polymorphic processing
        for (Employee emp : employees) {
            emp.displayDetails();

            // Access department details using instanceof
            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println("Department: " + dept.getDepartmentDetails());
            }

            System.out.println("----------------------------");
        }
    }
}