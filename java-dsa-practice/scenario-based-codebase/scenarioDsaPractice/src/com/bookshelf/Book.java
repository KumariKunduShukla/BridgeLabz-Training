package com.bookshelf;

public class Book {
	
	// attributes
	String title;
	String author;
	
	// parameterised constructor
	Book(String title, String author){
		super();
		this.title = title;
		this.author = author;
	}
   
	public boolean equals(Book book) {
		
		return this.title.equals(book.title) && this.author.equals(book.author);
	}
	
	public String toString() {
	  return title+" "+ "by" +" " +author;
	}
}
 