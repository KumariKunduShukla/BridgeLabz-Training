package com.encapsulationandpolymorphism.librarymanagement;

public abstract class LibraryItem {
	private int itemId;
    private String title;
    private String author;

    // Sensitive borrower data (encapsulated)
    private String borrowerName;
    private boolean isAvailable = true;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters (controlled access)
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected String getBorrowerName() {
        return borrowerName;
    }

    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
        this.isAvailable = false;
    }

    protected void returnItem() {
        this.borrowerName = null;
        this.isAvailable = true;
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }

    // Abstract method
    public abstract int getLoanDuration();
}
