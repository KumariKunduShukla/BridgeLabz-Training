package com.objectmodeling;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : enrolledStudents) {
            System.out.println("  Student: " + s.getName());
        }
    }
}