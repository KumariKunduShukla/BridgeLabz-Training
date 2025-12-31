package com.objectmodeling;

import java.util.ArrayList;
import java.util.List;

public class University {
	private String universityName;
    private List<Department> departments; // Composition
    private List<Faculty> faculties;      // Aggregation

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition: University creates departments
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation: Faculty passed from outside
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayUniversityDetails() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department d : departments) {
            d.displayDepartment();
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
    }
}