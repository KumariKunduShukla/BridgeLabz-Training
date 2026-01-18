package com.generics.coursemanagement;

public class Course <T extends CourseType> {

    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public void conductEvaluation() {
        courseType.evaluate();
    }

    public T getCourseType() {
        return courseType;
    }
}