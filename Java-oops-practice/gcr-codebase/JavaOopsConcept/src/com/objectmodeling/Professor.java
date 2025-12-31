package com.objectmodeling;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	private int id;
    private String name;
    private List<UniversityCourse> coursesTeaching = new ArrayList<>();

    public Professor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Communication with Course
    public void assignCourse(UniversityCourse course) {
        coursesTeaching.add(course);
        course.assignProfessor(this);
    }

    public String getName() {
        return name;
    }

    public void viewCoursesTeaching() {
        System.out.println("Professor: " + name);
        for (UniversityCourse c : coursesTeaching) {
            System.out.println("  Teaching: " + c.getCourseName());
        }
    }
}