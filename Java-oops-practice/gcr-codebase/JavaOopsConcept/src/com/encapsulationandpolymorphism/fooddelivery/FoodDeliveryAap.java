package com.encapsulationandpolymorphism.fooddelivery;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliveryAap {
	public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 1));

        processOrder(order);
    }

    // order processing
    public static void processOrder(List<FoodItem> items) {

        double grandTotal = 0;

        for (FoodItem item : items) {

            item.getItemDetails();

            double totalPrice = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discount = discountable.applyDiscount();
                System.out.println(discountable.getDiscountDetails());
            }

            double finalPrice = totalPrice - discount;
            grandTotal += finalPrice;

            System.out.println("Item Total: " + totalPrice);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("--------------------------------");
        }

        System.out.println("Grand Total Amount: " + grandTotal);
    }
}
