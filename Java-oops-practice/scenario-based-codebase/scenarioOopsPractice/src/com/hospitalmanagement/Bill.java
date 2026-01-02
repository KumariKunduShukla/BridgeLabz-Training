package com.hospitalmanagement;

class Bill implements Payable {
	// attributes
    private double baseAmount;
    private double taxRate = 0.10;      // 10% tax
    private double discountRate = 0.05; // 5% discount

    Bill(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    @Override
    public double calculatePayment() {
        double tax = baseAmount * taxRate;
        double discount = baseAmount * discountRate;
        return baseAmount + tax - discount;
    }
}
