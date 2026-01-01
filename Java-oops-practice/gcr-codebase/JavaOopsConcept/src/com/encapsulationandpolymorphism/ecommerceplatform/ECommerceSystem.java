package com.encapsulationandpolymorphism.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;


public class ECommerceSystem {
	public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 3000));
        products.add(new Groceries(103, "Rice Bag", 1200));

        //  processing
        PriceCalculator.printFinalPrices(products);
    }
}