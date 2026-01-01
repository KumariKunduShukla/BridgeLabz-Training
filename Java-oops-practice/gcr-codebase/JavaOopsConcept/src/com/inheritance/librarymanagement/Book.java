package com.inheritance.librarymanagement;

public class Book {

 // Common attributes
 protected String title;
 protected int publicationYear;

 // Constructor to initialize book details
 public Book(String title, int publicationYear) {
     this.title = title;
     this.publicationYear = publicationYear;
 }

 // Method to display book information
 public void displayInfo() {
     System.out.println("Book Title: " + title);
     System.out.println("Publication Year: " + publicationYear);
 }
}
