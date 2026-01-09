package com.skillforge;

public class BeginnerCourse extends Course {

	public BeginnerCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    @Override
    public String generateCertificate() {
        return "Beginner Level Certificate: Course Completed Successfully!";
    }
}