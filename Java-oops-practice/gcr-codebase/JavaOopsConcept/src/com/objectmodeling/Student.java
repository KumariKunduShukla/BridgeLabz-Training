package com.objectmodeling;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
    private String name;
    private List<Course> courses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Association logic
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void viewCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("  Enrolled in: " + c.getCourseName());
        }
    }
}