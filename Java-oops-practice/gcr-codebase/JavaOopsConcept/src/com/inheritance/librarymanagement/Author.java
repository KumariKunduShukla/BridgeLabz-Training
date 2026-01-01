package com.inheritance.librarymanagement;

  //Author class extending Book
   public class Author extends Book {

    // Additional attributes for Author
    private String name;
     private String bio;

      // Constructor calling superclass constructor
     public Author(String title, int publicationYear, String name, String bio) {
     super(title, publicationYear);
     this.name = name;
     this.bio = bio;
 }

     @Override
     public void displayInfo() {
     // Call superclass method
     super.displayInfo();

     // Display author-specific details
     System.out.println("Author Name: " + name);
     System.out.println("Author Bio: " + bio);
 }
}
