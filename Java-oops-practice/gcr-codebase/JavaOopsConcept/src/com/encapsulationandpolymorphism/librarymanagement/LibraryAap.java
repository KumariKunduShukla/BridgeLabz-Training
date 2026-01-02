package com.encapsulationandpolymorphism.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryAap {
	public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(101, "Java Programming", "James Gosling"));
        items.add(new Magazine(102, "Tech Monthly", "Editorial Team"));
        items.add(new DVD(103, "Inception", "Christopher Nolan"));

        manageLibraryItems(items);
    }

    // Polymorphic method
    public static void manageLibraryItems(List<LibraryItem> items) {

        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                reservable.reserveItem();
            }

            System.out.println("--------------------------------");
        }
    }
}