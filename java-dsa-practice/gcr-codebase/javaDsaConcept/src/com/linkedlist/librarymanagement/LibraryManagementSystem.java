package com.linkedlist.librarymanagement;

public class LibraryManagementSystem {
	public static void main(String[] args) {

        Library lib = new Library();

        lib.addAtBeginning("Java Basics", "James Gosling", "Programming", 101, true);
        lib.addAtEnd("DSA", "Mark Allen", "Computer Science", 102, true);
        lib.addAtPosition(2, "Operating System", "Silberschatz", "CS", 103, false);

        System.out.println("Books in Forward Order:");
        lib.displayForward();

        System.out.println("\nBooks in Reverse Order:");
        lib.displayReverse();

        System.out.println("\nSearch Book by Author:");
        lib.searchBook("James Gosling");

        lib.updateAvailability(103, true);

        lib.removeByBookId(102);

        lib.totalBooks();
    }
}