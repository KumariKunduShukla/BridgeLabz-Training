package com.JavaIOStream.csvhandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateEmployeeSalaryCSV {

    public static void main(String[] args) {

        String inputFile = "C:\\Users\\Kundu\\Desktop\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStream\\src\\main\\java\\com\\JavaIOStream\\csvhandling\\employees.csv";
        String outputFile = "C:\\Users\\Kundu\\Desktop\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStream\\src\\main\\java\\com\\JavaIOStream\\csvhandling\\employees_updated.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {

            String line;

            // Read and write header
            line = br.readLine();
            bw.write(line);
            bw.newLine();

            // Process remaining records
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                // Increase salary by 10% for IT department
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                // Write updated record
                bw.write(data[0] + "," +
                         data[1] + "," +
                         department + "," +
                         (int) salary);
                bw.newLine();
            }

            System.out.println("Employee salaries updated successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
