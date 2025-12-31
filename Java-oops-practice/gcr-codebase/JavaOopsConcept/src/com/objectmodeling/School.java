package com.objectmodeling;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void displayStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println("  Student: " + s.getName());
        }
    }
}
