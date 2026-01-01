package com.encapsulationandpolymorphism.ecommerceplatform;

import java.util.List;

public class PriceCalculator {
	// method
    public static void printFinalPrices(List<Product> products) {

        for (Product product : products) {

            product.displayBasicDetails();

            double tax = 0;
            if (product instanceof Taxable) {
                Taxable taxable = (Taxable) product;
                tax = taxable.calculateTax();
                System.out.println("Tax: ₹" + tax + " (" + taxable.getTaxDetails() + ")");
            } else {
                System.out.println("Tax: ₹0 (Non-Taxable)");
            }

            double discount = product.calculateDiscount();
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Discount: ₹" + discount);
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println("-----------------------------");
        }
    }
}


