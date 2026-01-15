package com.smartcheckout;

import java.util.*;

public class SmartCheckout {
	// Queue for customers
    Queue<Customer> customerQueue = new LinkedList<>();

    // HashMaps for price and stock
    HashMap<String, Integer> priceMap = new HashMap<>();
    HashMap<String, Integer> stockMap = new HashMap<>();

    // Initialize items
    void addItems() {
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 30);
        priceMap.put("Eggs", 10);

        stockMap.put("Milk", 10);
        stockMap.put("Bread", 5);
        stockMap.put("Eggs", 20);
    }

    // Add customer to queue
    void addCustomer(Customer customer) {
        customerQueue.add(customer);
        System.out.println(customer.name + " added to checkout queue");
    }

    // Process customer
    void processCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer customer = customerQueue.poll();
        int totalBill = 0;

        System.out.println("\nProcessing customer: " + customer.name);

        for (String item : customer.items) {
            if (stockMap.containsKey(item) && stockMap.get(item) > 0) {
                int price = priceMap.get(item);
                totalBill += price;

                // Update stock
                stockMap.put(item, stockMap.get(item) - 1);
                System.out.println(item + " purchased for Rs." + price);
            } else {
                System.out.println(item + " is out of stock");
            }
        }

        System.out.println("Total Bill: Rs." + totalBill);
    }
}