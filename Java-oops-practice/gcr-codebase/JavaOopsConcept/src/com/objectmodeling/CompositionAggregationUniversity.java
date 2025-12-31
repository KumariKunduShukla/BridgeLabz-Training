package com.objectmodeling;

public class CompositionAggregationUniversity {
	public static void main(String[] args) {

        // Faculty exists independently
        Faculty f1 = new Faculty(101, "Dr. Sharma");
        Faculty f2 = new Faculty(102, "Dr. Mehta");
        Faculty f3 = new Faculty(103, "Dr. Singh");

        // University created
        University uni = new University("National University");

        // Composition: Departments belong to University
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");
        uni.addDepartment("Electrical Engineering");

        // Aggregation: Faculty added
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.addFaculty(f3);

        uni.displayUniversityDetails();

        // Deleting University
        uni = null;
        System.out.println("\nUniversity deleted.");

        // Faculty still exists
        f1.displayFaculty();
        f2.displayFaculty();
        f3.displayFaculty();
    }
}