package com.JavaIOStream.json.practiceproblem;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJson {

    public static void main(String[] args) {

        JSONObject student = new JSONObject();
        student.put("name", "Kundu Shukla");
        student.put("age", 21);

        JSONArray subjects = new JSONArray();
        subjects.put("Java");
        subjects.put("Spring Boot");
        subjects.put("SQL");
        subjects.put("Python");
        subjects.put("C++");

        

        student.put("subjects", subjects);

        System.out.println(student.toString(4));
    }
}