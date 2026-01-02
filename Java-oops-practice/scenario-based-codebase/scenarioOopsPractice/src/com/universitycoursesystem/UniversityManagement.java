package com.universitycoursesystem;

public class UniversityManagement {
	public static void main(String[] args) {

        Student s1 = new UnderGraduate(101, "Rahul", "AI");
        Student s2 = new PostGraduate(201, "Anita");

        Course c1 = new Course("CS101", "Data Structures");

        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s2, c1);

        Faculty f1 = new Faculty("Dr. Sharma");

        f1.gradeStudent(e1, "A");      // Letter grading
        f1.gradeStudent(e2, "PASS");   // Pass/Fail grading

        System.out.println(s1.getTranscript());
        System.out.println(s2.getTranscript());
    }
}
