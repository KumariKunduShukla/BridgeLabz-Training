package com.objectmodeling;

import java.util.ArrayList;
import java.util.List;

public class University1 {
	private String name;
    private List<UniversityStudent> students = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();
    private List<UniversityCourse> courses = new ArrayList<>();

    public University1(String name) {
        this.name = name;
    }

    public void addStudent(UniversityStudent student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(UniversityCourse course) {
        courses.add(course);
    }
}