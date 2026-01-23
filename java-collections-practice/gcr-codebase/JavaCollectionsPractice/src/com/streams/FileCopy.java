package com.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileCopy {
	public static void main(String[] args) {

	    	String source = "src/source.txt";
	        String destination = "src/destination.txt";

	        try (FileInputStream fis = new FileInputStream(source);
	             FileOutputStream fos = new FileOutputStream(destination)) {

	            int data;
	            // Read byte by byte and write to destination
	             while ((data = fis.read()) != -1) {
	                fos.write(data);
	            }

	            System.out.println("File copied successfully");

	        } catch (IOException e) {
	            System.out.println("Source file not found or I/O error");
	        }
	    }
	}