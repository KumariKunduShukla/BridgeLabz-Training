package com.foodloop;

public class FoodLoopAap {
	public static void main(String[] args) {
		
		FoodItem item1 = new VegItem("Kaju Panner","Sbji",250,5);
		FoodItem item2 = new VegItem("Tandoori Roti","Roti", 200, 3);
		FoodItem item5 = new VegItem("Chole","Sbji", 150, 2);
        FoodItem item3 = new NonVegItem("Chicken Curry", "Sbji",350, 4);
        FoodItem item4 = new NonVegItem("Non veg biryani","Rice", 300, 2);
        
        // Display Availability
        System.out.println(" Menu Availability:");
        item1.showAvailability();
        item2.showAvailability();
        item3.showAvailability();
        item4.showAvailability();
        item5.showAvailability();
        System.out.println();
        
        Order order = new Order();
        
        // Add item
        order.aadItem(item1);
        order.aadItem(item3);
        order.aadItem(item4);
        order.aadItem(item2);
        order.aadItem(item5);
        order.aadItem(item1);
        
        // Placed order
        order.placeOrder();
        

		
	}

}
