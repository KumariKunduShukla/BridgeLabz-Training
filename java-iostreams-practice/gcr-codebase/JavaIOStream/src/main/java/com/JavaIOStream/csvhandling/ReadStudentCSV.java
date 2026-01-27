package com.JavaIOStream.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentCSV {
	 public static void main(String[] args) {
	        String file = "C:\\Users\\Kundu\\Desktop\\Java programming workspace\\java-iostreams-practice\\gcr-codebase\\JavaIOStream\\src\\main\\java\\com\\JavaIOStream\\csvhandling\\student.csv";
	        String line;

	        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

	            br.readLine(); // skip header

	            while ((line = br.readLine()) != null) {
	                String[] data = line.split(",");

	                System.out.println("ID    : " + data[0]);
	                System.out.println("Name  : " + data[1]);
	                System.out.println("Age   : " + data[2]);
	                System.out.println("Marks : " + data[3]);
	                System.out.println("--------------------");
	            }

	        } catch (IOException e) {
	            System.out.println("Error reading CSV file");
	        }
	    }
	}


