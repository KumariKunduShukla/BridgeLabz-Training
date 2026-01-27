package com.JavaIOStream.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Kundu\\Desktop\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStream\\src\\main\\java\\com\\JavaIOStream\\csvhandling\\employee.csv";
        int recordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header row
            br.readLine();

            // Read remaining lines
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    recordCount++;
                }
            }

            System.out.println("Total number of records: " + recordCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
