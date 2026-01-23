package com.exceptionhandling;

import java.util.*;
import java.util.InputMismatchException;

public class DivisionCheckException {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Try block where exception can occur
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        }
        
        // Catch block 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only");
        }
        
        sc.close();
    }
}