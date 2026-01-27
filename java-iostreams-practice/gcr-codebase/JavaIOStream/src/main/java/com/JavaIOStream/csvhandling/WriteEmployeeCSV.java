package com.JavaIOStream.csvhandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Kundu\\Desktop\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStream\\src\\main\\java\\com\\JavaIOStream\\csvhandling\\employee.csv";

        try (FileWriter writer = new FileWriter(filePath)) {

            // Header
            writer.append("ID,Name,Department,Salary\n");

            // Records
            writer.append("101,Anil,IT,55000\n");
            writer.append("102,Sneha,HR,48000\n");
            writer.append("103,Rahul,Finance,62000\n");
            writer.append("104,Pooja,Marketing,50000\n");
            writer.append("105,Amit,Operations,58000\n");

            System.out.println("CSV file written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
