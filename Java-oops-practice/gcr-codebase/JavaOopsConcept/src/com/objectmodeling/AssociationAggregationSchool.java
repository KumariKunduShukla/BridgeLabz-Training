package com.objectmodeling;

public class AssociationAggregationSchool {
      public static void main(String[] args)
      {
    	  // School (Aggregation)
          School school = new School("Green Valley School");

          // Students
          Student s1 = new Student(1, "Amit");
          Student s2 = new Student(2, "Riya");

          school.addStudent(s1);
          school.addStudent(s2);

          // Courses
          Course java = new Course("Java");
          Course python = new Course("Python");

          // Association (many-to-many)
          s1.enrollCourse(java);
          s1.enrollCourse(python);

          s2.enrollCourse(java);

          // Display
          school.displayStudents();
          System.out.println();

          s1.viewCourses();
          System.out.println();

          java.displayEnrolledStudents();
      }
  }

