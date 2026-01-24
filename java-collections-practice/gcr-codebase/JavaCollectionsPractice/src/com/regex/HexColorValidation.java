package com.regex;

import java.util.Scanner;

public class HexColorValidation {

    public static void main(String[] args) {

        // Create Scanner for user input
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Hex Color Code: ");
        String color = sc.nextLine();

        String regex = "^#[0-9A-Fa-f]{6}$";
        
        if (color.matches(regex)) {
            System.out.println(" Valid Hex Color Code");
        } 
        else {
            System.out.println(" Invalid Hex Color Code");
        }

        // Close scanner
        sc.close();
    }
}
