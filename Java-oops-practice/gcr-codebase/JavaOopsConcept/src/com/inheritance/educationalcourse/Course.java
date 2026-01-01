package com.inheritance.educationalcourse;

public class Course {
	// Common attributes for all courses
    protected String courseName;
    protected int duration; // duration in hours

    // Constructor to initialize course details
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display basic course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}