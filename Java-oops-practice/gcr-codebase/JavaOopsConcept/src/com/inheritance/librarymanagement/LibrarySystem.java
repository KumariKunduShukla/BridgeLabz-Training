package com.inheritance.librarymanagement;

public class LibrarySystem {
	public static void main(String[] args) {

        // Creating an Author object (which is also a Book)
        Book book = new Author(
                "Effective Java",
                2018,
                "Joshua Bloch",
                "Expert in Java and API design"
        );

        // method call
        book.displayInfo();
    }
}