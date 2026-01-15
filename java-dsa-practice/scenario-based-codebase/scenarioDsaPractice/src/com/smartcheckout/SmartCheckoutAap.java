package com.smartcheckout;

public class SmartCheckoutAap {
	public static void main(String[] args) {

		SmartCheckoutManager manager = new SmartCheckoutManager();

		// add item to store
		manager.addItemStore("Bisciut", 50, 10);
		manager.addItemStore("Chocolate", 30, 5);
		manager.addItemStore("Maggie", 12, 20);

		// create customers
		Customer customer1 = new Customer("Utkarsh");
		customer1.addItem("Chocolate", 2);
		customer1.addItem("Biscuit", 4);

		Customer customer2 = new Customer("Anuj");
		customer2.addItem("Maggie", 12);
		customer2.addItem("Biscuit", 109);

		// add customers to queue
		manager.addCustomer(customer1);
		manager.addCustomer(customer2);

		manager.processBilling();
		manager.processBilling();
		manager.processBilling();
	}
}

