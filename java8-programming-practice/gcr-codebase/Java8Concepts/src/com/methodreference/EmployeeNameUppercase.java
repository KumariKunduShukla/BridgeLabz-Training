package com.methodreference;
import java.util.Arrays;
import java.util.List;

public class EmployeeNameUppercase {

    public static void main(String[] args) {

        List<String> employeeNames = Arrays.asList("avika","shagun","sherya","aarushi","riya");

        // Convert to uppercase and print (no collector used)
        employeeNames.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}