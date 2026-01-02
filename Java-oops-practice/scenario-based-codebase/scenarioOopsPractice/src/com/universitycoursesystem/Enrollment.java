package com.universitycoursesystem;

class Enrollment implements Graded {
    private Student student;
    private Course course;

    Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    // grading behavior
    @Override
    public void assignGrade(String grade) {

        double gpaValue;

        // Letter grading
        if (grade.equals("A")) {
            gpaValue = 4.0;
        } else if (grade.equals("B")) {
            gpaValue = 3.0;
        } else if (grade.equals("C")) {
            gpaValue = 2.0;
        }
        // Pass/Fail grading
        else if (grade.equals("PASS")) {
            gpaValue = 2.5;
        } else {
            gpaValue = 0.0;
        }

        student.setGpa(gpaValue);
    }
}
