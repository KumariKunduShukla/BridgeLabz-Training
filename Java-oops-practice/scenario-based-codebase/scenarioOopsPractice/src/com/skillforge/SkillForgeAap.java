package com.skillforge;

public class SkillForgeAap {
	public static void main(String[] args) {

        Instructor instructor = new Instructor(
                "Dr. Rao", "rao@skillforge.com", "Java");

        Student student = new Student(
                "Rashi", "rashi@gmail.com");

        String[] modules = {
                "OOPs Basics", "Inheritance", "Polymorphism", "Projects"
        };

        Course course1 = new BeginnerCourse(
                "Java Foundations", instructor, modules);

        Course course2 = new AdvancedCourse(
                "Advanced Java", instructor, modules);

        instructor.uploadCourse(course1);

        student.completeModule(40);
        student.completeModule(30);

        if (course1.trackProgress(student.getProgress())) {
            System.out.println(course1.generateCertificate());
        }

        System.out.println(course2.generateCertificate());
    }
}