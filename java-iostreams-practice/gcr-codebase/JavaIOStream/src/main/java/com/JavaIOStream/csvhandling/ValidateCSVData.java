package com.JavaIOStream.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Kundu\\Desktop\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStream\\src\\main\\java\\com\\JavaIOStream\\csvhandling\\users.csv";
        String line="";
        
        String emailregex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneregex = "^\\d{10}$";
        
        Pattern emailPattern = Pattern.compile(emailregex);
        Pattern phonePattern = Pattern.compile(phoneregex);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                boolean emailValid = emailPattern.matcher(data[2]).matches();
                boolean phoneValid = phonePattern.matcher(data[3]).matches();

                if (!emailValid || !phoneValid) {
                    System.out.println("Invalid Row: " + line);

                    if (!emailValid)
                        System.out.println(" Invalid Email");

                    if (!phoneValid)
                        System.out.println(" Invalid Phone Number");

                    System.out.println("----------------------");
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }
    }
}