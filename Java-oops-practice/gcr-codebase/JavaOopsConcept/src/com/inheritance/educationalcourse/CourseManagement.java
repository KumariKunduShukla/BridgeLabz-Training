package com.inheritance.educationalcourse;

public class CourseManagement {
	public static void main(String[] args) {

        Course basicCourse = new Course("Java Basics", 40);

        Course onlineCourse = new OnlineCourse(
                "Advanced Java",
                60,
                "Coursera",
                true
        );

        Course paidCourse = new PaidOnlineCourse(
                "Full Stack Java",
                120,
                "Udemy",
                true,
                15000,
                20
        );

        // method calls
        basicCourse.displayCourseDetails();
        System.out.println("---------------------");

        onlineCourse.displayCourseDetails();
        System.out.println("---------------------");

        paidCourse.displayCourseDetails();
    }
}