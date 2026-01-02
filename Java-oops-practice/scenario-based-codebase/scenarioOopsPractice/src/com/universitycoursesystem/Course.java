package com.universitycoursesystem;

class Course {
    private String courseCode;
    private String courseName;

    Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseDetails() {
        return courseCode + " - " + courseName;
    }
}
