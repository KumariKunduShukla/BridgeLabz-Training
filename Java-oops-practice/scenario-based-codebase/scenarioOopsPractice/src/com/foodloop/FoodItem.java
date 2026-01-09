package com.foodloop;

public abstract class FoodItem {
    
	// attributes
	private String name;
	private String category;
	private double price;
	private boolean available;
	private int stock;
	
	FoodItem(String name, String category, double price, int stock){
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.available = stock>0;
	}
	
	
	public boolean isAvailable() {
		return available;
	}
	
	public double getPrice() {
		return price;
	}
	
	protected void reduceStock() {
		if(stock > 0) {
			stock--;
		}
		if(stock == 0) {
			available = false;
		}
	}

    public String getName() {
   	 return name;
    }
    
    public void showAvailability() {
        if (stock > 0) {
            System.out.println(name + " → Available ( "+stock+"left )");
        } else {
            System.out.println(name + " → Out of Stock ");
        }
    }

	
}
    