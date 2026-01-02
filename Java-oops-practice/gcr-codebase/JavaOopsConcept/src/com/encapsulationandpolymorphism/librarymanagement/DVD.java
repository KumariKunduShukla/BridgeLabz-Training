package com.encapsulationandpolymorphism.librarymanagement;

public class DVD extends LibraryItem implements Reservable {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem() {
        if (checkAvailability()) {
            setBorrowerName("Reserved for Member");
            System.out.println("DVD reserved successfully");
        } else {
            System.out.println("DVD is not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return getBorrowerName() == null;
    }
}

