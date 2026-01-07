package com.stringbuilder;

import java.util.Scanner;

public class ReverseStringUsingStringBuilder {
	// method to reverse a string
	public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);        
        sb.reverse();            
        return sb.toString();    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }
}
