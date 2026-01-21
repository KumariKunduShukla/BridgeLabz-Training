package com.sorting.tailorshop;
class Order {
    int orderId;
    int deliveryDeadline; // days remaining

    Order(int orderId, int deliveryDeadline) {
        this.orderId = orderId;
        this.deliveryDeadline = deliveryDeadline;
    }
}