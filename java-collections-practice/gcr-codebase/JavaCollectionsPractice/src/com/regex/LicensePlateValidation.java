package com.regex;

import java.util.Scanner;

public class LicensePlateValidation {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter License Plate Number: ");
        String plateNumber = sc.nextLine();

      
        String regex = "^[A-Z]{2}[0-9]{4}$";

        if (plateNumber.matches(regex)) {
            System.out.println(" Valid License Plate Number");
        } else {
            System.out.println(" Invalid License Plate Number");
        }

        // Close scanner
        sc.close();
    }
}
