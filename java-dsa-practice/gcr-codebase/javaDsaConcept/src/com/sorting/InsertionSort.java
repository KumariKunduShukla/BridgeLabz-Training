package com.sorting;

import java.util.Scanner;

public class InsertionSort {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
            
	        // User input for employee ID
	        System.out.print("Enter number of employees: ");
	        int n = sc.nextInt();

	        int[] employeeId = new int[n];

	        System.out.println("Enter employee IDs:");
	        for (int i = 0; i < n; i++) {
	            employeeId[i] = sc.nextInt();
	        }

	        // Insertion Sort
	        for (int i = 1; i < n; i++) {
	            int key = employeeId[i];
	            int j = i - 1;

	            while (j >= 0 && employeeId[j] > key) {
	                employeeId[j + 1] = employeeId[j];
	                j--;
	            }

	            employeeId[j + 1] = key;
	        }
            
	        // Employee ID in sorted order
	        System.out.println("Sorted Employee IDs:");
	        for (int id : employeeId) {
	            System.out.print(id + " ");
	        }
            
	        // Closing scanner stream
	        sc.close();
	    }
	}