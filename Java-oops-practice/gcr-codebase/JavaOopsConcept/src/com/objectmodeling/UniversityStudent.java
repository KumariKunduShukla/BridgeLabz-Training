package com.objectmodeling;

import java.util.ArrayList;
import java.util.List;

public class UniversityStudent {
	private int id;
    private String name;
    private List<UniversityCourse> courses = new ArrayList<>();

    public UniversityStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Communication with Course
    public void enrollCourse(UniversityCourse course) {
        courses.add(course);
        course.addStudent(this);
    }

    public String getName() {
        return name;
    }

    public void viewCourses() {
        System.out.println("Student: " + name);
        for (UniversityCourse c : courses) {
            System.out.println("  Enrolled in: " + c.getCourseName());
        }
    }
}