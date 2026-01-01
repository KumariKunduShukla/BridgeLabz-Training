package com.inheritance.onlineretail;

// Subclass representing a shipped order
public class ShippedOrder extends Order {

    // Additional attribute for shipped orders
    protected String trackingNumber;

    // Constructor calling superclass constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped (Tracking No: " + trackingNumber + ")";
    }
}

