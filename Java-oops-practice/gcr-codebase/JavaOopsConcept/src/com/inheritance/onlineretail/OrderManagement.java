package com.inheritance.onlineretail;

public class OrderManagement {
	public static void main(String[] args) {

        // Order placed
        Order order1 = new Order("ORD101", "2025-01-01");

        // Order shipped
        Order order2 = new ShippedOrder("ORD102", "2025-01-02", "TRK98765");

        // Order delivered
        Order order3 = new DeliveredOrder(
                "ORD103",
                "2025-01-03",
                "TRK12345",
                "2025-01-05"
        );

        // method calls
        System.out.println(order1.getOrderStatus());
        System.out.println(order2.getOrderStatus());
        System.out.println(order3.getOrderStatus());
    }
}