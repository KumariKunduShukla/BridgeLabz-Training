package com.skillforge;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    @Override
    public String generateCertificate() {
        return "Advanced Level Certificate: Excellence in Mastery!";
    }
}