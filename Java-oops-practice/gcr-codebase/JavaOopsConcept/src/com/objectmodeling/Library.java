package com.objectmodeling;

import java.util.ArrayList;

public class Library {
	private String libraryName;
    private ArrayList<Book> books;

    // Constructor
    Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    // Method to add book
    void addBook(Book book) {
        books.add(book);
    }

    // Method to display library books
    void displayLibraryBooks() {
        System.out.println("\nLibrary: " + libraryName);
        for (Book book : books) {
            book.displayBook();
        }
    }
}
