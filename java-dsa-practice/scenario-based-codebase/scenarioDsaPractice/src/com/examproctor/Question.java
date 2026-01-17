package com.examproctor;

public class Question {
	    int id;
	    String questionText;
	    String[] options;

	    // Constructor
	    public Question(int id, String questionText, String[] options) {
	        this.id = id;
	        this.questionText = questionText;
	        this.options = options;
	    }

	    // Method to display question
	    public void display() {
	        System.out.println("\nQuestion " + id + ": " + questionText);
	        for (String option : options) {
	            System.out.println(option);
	        }
	    }
	}
