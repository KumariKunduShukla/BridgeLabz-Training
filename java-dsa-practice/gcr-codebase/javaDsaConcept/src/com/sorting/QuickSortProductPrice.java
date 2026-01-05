package com.sorting;

import java.util.Scanner;

public class QuickSortProductPrice {
	
	// Method to perform Quick Sort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            
            quickSort(arr, low, pivotIndex - 1);

            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Method to place pivot element at correct position
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return pivot index
        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of products
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        // Input product prices
        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        
        quickSort(prices, 0, n - 1);

        // Display sorted prices
        System.out.println("Sorted Product Prices (Ascending Order):");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        sc.close();
    }
}