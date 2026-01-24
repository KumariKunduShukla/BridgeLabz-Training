package com.regex;

public class ReplaceSpaces {
    public static void main(String[] args) {

        String input = "This   is   an      example     with    multiple    spaces.";

        // Replace multiple spaces with a single space
        String output = input.replaceAll("\\s+", " ");

        System.out.println(output);
    }
}
