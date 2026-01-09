package com.io;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WordCountInFile {
	 public static void main(String[] args) {

	        String filePath = "src/com/io/input.txt";   // file to read
	        String targetWord = "java";       // word to count
	        int count = 0;

	        try {
	            // Create FileReader
	            FileReader fr = new FileReader(filePath);

	            // Wrap with BufferedReader
	            BufferedReader br = new BufferedReader(fr);

	            String line;

	            // Read file line by line
	            while ((line = br.readLine()) != null) {

	                // Convert line to lowercase for case-insensitive comparison
	                String[] words = line.toLowerCase().split("\\s+");

	                // Count word occurrences
	                for (String word : words) {
	                    if (word.equals(targetWord.toLowerCase())) {
	                        count++;
	                    }
	                }
	            }

	            // Close the file
	            br.close();

	            // Print result
	            System.out.println("Occurrences of \"" + targetWord + "\": " + count);

	        } 
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
