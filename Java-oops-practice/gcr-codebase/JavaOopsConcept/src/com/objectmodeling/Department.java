package com.objectmodeling;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(int id, String name) {
        employees.add(new Employee(id, name));
    }

    public void displayDepartment() {
        System.out.println("  Department: " + deptName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}