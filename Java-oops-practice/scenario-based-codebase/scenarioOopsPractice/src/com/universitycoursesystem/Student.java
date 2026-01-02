package com.universitycoursesystem;

public class Student {
	// attributes
	protected int studentId;
    protected String name;
    protected String electivePreference;
    private double gpa;

    // Constructor without elective
    Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.electivePreference = "None";
    }

    // Constructor with elective
    Student(int studentId, String name, String electivePreference) {
        this.studentId = studentId;
        this.name = name;
        this.electivePreference = electivePreference;
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getTranscript() {
        return "ID: " + studentId +
               ", Name: " + name +
               ", GPA: " + gpa;
    }
}