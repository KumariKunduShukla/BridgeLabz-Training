package com.collectors;

import java.util.*;
import java.util.stream.*;

class Student {

    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}

public class StudentResultGrouping {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Nikita", "A"),
                new Student("Vinita", "B"),
                new Student("Aashi", "A"),
                new Student("Priya", "C"),
                new Student("Karan", "B"));

        Map<String, List<String>> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGrade,
                                Collectors.mapping(Student::getName,
                                        Collectors.toList())));

        result.forEach((grade, names) ->
                System.out.println(grade + " -> " + names));
    }
}