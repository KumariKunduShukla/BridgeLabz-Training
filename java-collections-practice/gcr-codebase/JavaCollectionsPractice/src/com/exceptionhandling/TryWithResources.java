package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TryWithResources {
	
	 public static void main(String[] args) {

	        try (BufferedReader br = new BufferedReader(new FileReader("src/source.txt"))) {

	            String line = br.readLine();
	            if (line != null) {
	                System.out.println(line);
	            }

	        } catch (IOException e) {
	            System.out.println("Error in reading file");
	        }
	    }
	}