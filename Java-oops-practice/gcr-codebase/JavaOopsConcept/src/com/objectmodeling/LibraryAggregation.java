package com.objectmodeling;

public class LibraryAggregation {
	public static void main(String[] args) {

        // Create Book objects (Independent)
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Introduction to Algorithms", "Thomas H. Cormen et al");
        Book b3 = new Book("Effective Java", "Joshua Bloch");
        Book b4 = new Book("Version Control with Git", "Jon Loeliger & Matthew McCullough");

        // Create Library objects
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        // Add books to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);  // Same book in another library
        lib2.addBook(b3);
        lib2.addBook(b4);

        // Display library details
        lib1.displayLibraryBooks();
        lib2.displayLibraryBooks();
    }
}