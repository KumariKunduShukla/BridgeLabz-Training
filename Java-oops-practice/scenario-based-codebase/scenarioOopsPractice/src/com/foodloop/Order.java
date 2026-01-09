package com.foodloop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {
	
	private List<FoodItem> items;
	private double total;
	
	public Order() {
		items = new ArrayList<>();
	}
	
	public Order(List<FoodItem> items) {
		this.items = items;
	}
	
	public void aadItem(FoodItem item) {
		if(item.isAvailable()) {
			items.add(item);
			item.reduceStock();
		}
		else {
			System.out.println(item.getName() + " is out of stock.");
		}
	}
	
	private void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();    // operator usage
        }
        total -= applyDiscount();
    }

    // Polymorphism based on order total
    private double applyDiscount() {
        if (total >= 1000) {
            return total * 0.20;   // 20% discount
        } else if (total >= 500) {
            return total * 0.10;   // 10% discount
        }
        return 0;
    }

	@Override
	public void placeOrder() {
		calculateTotal();
        System.out.println("Order placed successfully!");
        System.out.println("Total amount after discount: ₹" + total);
    }
	
	@Override
	public void cancelOrder() {
		items.clear();
        total = 0;
        System.out.println("Order cancelled.");
    }
}
