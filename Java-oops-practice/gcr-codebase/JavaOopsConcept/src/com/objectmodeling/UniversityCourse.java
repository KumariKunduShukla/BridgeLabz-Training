package com.objectmodeling;

import java.util.ArrayList;
import java.util.List;

public class UniversityCourse {
	
	private String courseName;
    private Professor professor;
    private List<UniversityStudent> students = new ArrayList<>();

    public UniversityCourse(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // Called by Student
    public void addStudent(UniversityStudent student) {
        students.add(student);
    }

    // Called by Professor
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("  Professor: " +
                (professor != null ? professor.getName() : "Not Assigned"));

        System.out.println("  Students:");
        for (UniversityStudent s : students) {
            System.out.println("    " + s.getName());
        }
    }
}