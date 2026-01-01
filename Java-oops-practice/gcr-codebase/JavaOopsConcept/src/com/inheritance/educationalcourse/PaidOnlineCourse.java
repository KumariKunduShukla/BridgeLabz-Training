package com.inheritance.educationalcourse;

//PaidOnlineCourse extends OnlineCourse
public class PaidOnlineCourse extends OnlineCourse {

   // Additional attributes for paid online courses
   private double fee;
   private double discount; // percentage

   // Constructor calling superclass constructor
   public PaidOnlineCourse(String courseName, int duration,
                         String platform, boolean isRecorded,
                         double fee, double discount) {
     super(courseName, duration, platform, isRecorded);
     this.fee = fee;
     this.discount = discount;
 }

   @Override
   public void displayCourseDetails() {
     super.displayCourseDetails();
     System.out.println("Course Fee: ₹" + fee);
     System.out.println("Discount: " + discount + "%");
     System.out.println("Final Price: ₹" + calculateFinalPrice());
   }

   // Method to calculate final price after discount
   private double calculateFinalPrice() {
     return fee - (fee * discount / 100);
 }
}
