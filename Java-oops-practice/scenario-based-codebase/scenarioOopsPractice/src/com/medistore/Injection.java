package com.medistore;

import java.time.LocalDate;

public class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public void checkExpiry() {
        if (expiryDate.minusDays(30).isBefore(LocalDate.now())) {
            System.out.println("⚠ Injection critical near expiry");
        } else {
            System.out.println("✅ Injection is usable");
        }
    }
}