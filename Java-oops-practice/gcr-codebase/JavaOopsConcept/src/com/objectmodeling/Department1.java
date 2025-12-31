package com.objectmodeling;

public class Department1 {
	private String departmentName;

    public Department1(String departmentName) {
        this.departmentName = departmentName;
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
    }
}