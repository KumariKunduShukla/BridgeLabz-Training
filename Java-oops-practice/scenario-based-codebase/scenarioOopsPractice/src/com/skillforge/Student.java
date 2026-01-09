package com.skillforge;

public class Student extends User {
	private int progress; 

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
    }

    public void completeModule(int score) {
        progress += score;   
        if (progress > 100) {
            progress = 100;
        }
    }

    public int getProgress() {
        return progress;
    }
}