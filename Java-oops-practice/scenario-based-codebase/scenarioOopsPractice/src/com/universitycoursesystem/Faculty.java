package com.universitycoursesystem;

class Faculty {
    private String facultyName;

    Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void gradeStudent(Graded enrollment, String grade) {
        enrollment.assignGrade(grade);
    }
}
