package com.inheritance.onlineretail;

public class Order {
	// Common attributes for all orders
    protected String orderId;
    protected String orderDate;

    // Constructor to initialize order details
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get current order status
    public String getOrderStatus() {
        return "Order Placed";
    }
}