package com.objectmodeling;

public class UniversitySystem {
	public static void main(String[] args) {

        University1 uni = new University1("Tech University");

        UniversityStudent s1 = new UniversityStudent(1, "Amit");
        UniversityStudent s2 = new UniversityStudent(2, "Riya");

        Professor p1 = new Professor(101, "Dr. Sharma");

        UniversityCourse java = new UniversityCourse("Java");
        UniversityCourse python = new UniversityCourse("Python");

        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);
        uni.addCourse(java);
        uni.addCourse(python);

        // Interactions
        s1.enrollCourse(java);
        s1.enrollCourse(python);
        s2.enrollCourse(java);

        p1.assignCourse(java);

        // Output
        s1.viewCourses();
        System.out.println();

        p1.viewCoursesTeaching();
        System.out.println();

        java.showCourseDetails();
    }
}