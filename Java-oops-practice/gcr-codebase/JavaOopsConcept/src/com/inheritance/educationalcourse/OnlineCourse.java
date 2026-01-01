package com.inheritance.educationalcourse;

//OnlineCourse extends Course
public class OnlineCourse extends Course {

   // Additional attributes for online courses
   protected String platform;
   protected boolean isRecorded;

   // Constructor calling superclass constructor
   public OnlineCourse(String courseName, int duration,
                     String platform, boolean isRecorded) {
     super(courseName, duration);
     this.platform = platform;
     this.isRecorded = isRecorded;
   }

   @Override
    public void displayCourseDetails() {
     super.displayCourseDetails();
     System.out.println("Platform: " + platform);
     System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
 }
}
