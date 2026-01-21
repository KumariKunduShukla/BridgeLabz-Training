package com.sorting.tailorshop;
class TailorShop {

    // Insertion Sort based on delivery deadline
    static void sortOrdersByDeadline(Order[] orders) {
        for (int i = 1; i < orders.length; i++) {

            Order currentOrder = orders[i];
            int j = i - 1;

            // Shift orders with later deadlines
            while (j >= 0 && orders[j].deliveryDeadline > currentOrder.deliveryDeadline) {
                orders[j + 1] = orders[j];
                j--;
            }

            orders[j + 1] = currentOrder;
        }
    }

    // Display orders
    static void displayOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println(
                "Order ID: " + o.orderId +
                " | Delivery Deadline: " + o.deliveryDeadline + " days"
            );
        }
    }

    public static void main(String[] args) {

        Order[] orders = {
            new Order(101, 7),
            new Order(102, 10),
            new Order(103, 15),
            new Order(104, 12)  // newly added order
        };

        System.out.println("Before Sorting:");
        displayOrders(orders);

        sortOrdersByDeadline(orders);

        System.out.println("\nAfter Sorting by Delivery Deadline:");
        displayOrders(orders);
    }
}
