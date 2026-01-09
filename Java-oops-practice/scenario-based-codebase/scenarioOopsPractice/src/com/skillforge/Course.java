package com.skillforge;

import java.util.ArrayList;
import java.util.List;

public abstract class Course implements ICertifiable {

	    private String title;
	    private Instructor instructor;
	    private double rating;
	    private String[] modules;
	    private final List<String> reviews; // read-only externally

	    // Default constructor
	    public Course() {
	        this.modules = new String[] { "Introduction" };
	        this.reviews = new ArrayList<>();
	    }

	    // Constructor without custom modules
	    public Course(String title, Instructor instructor) {
	        this.title = title;
	        this.instructor = instructor;
	        this.modules = new String[] { "Introduction", "Basics" };
	        this.reviews = new ArrayList<>();
	    }

	    // Constructor with custom modules
	    public Course(String title, Instructor instructor, String[] modules) {
	        this.title = title;
	        this.instructor = instructor;
	        this.modules = modules;
	        this.reviews = new ArrayList<>();
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String[] getModules() {
	        return modules;
	    }

	    public double getRating() {
	        return rating;
	    }

	    // Protected rating logic (encapsulation)
	    protected void calculateRating(int score) {
	        rating = (rating + score) / 2;
	    }

	    // Progress tracking using operators
	    public boolean trackProgress(int progress) {
	        return progress >= 60; // grading condition
	    }

	    // Internal review handling (read-only externally)
	    public void addReview(String review) {
	        reviews.add(review);
	    }
	}
	