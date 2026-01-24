package com.regex;

public class CensorBadWords {
    public static void main(String[] args) {

        String text = "This is a damn bad example with some stupid words.";

        // List of bad words
        String[] badWords = {"damn", "stupid"};

        for (String word : badWords) {
            // \\b ensures only whole words are replaced
            text = text.replaceAll("\\b" + word + "\\b", "****");
        }

        System.out.println(text);
    }
}
