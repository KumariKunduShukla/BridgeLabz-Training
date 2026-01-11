package com.bookshelf;

import java.util.HashMap;
import java.util.Map;

public class Library {
	
   Map<String,BookNode> map=new HashMap<>();
	
	void addBook(String genre, Book book) {
		BookNode node=new BookNode(book);
		if(!map.containsKey(genre)) {
			map.put(genre, node);
		}else {
			BookNode temp=map.get(genre);
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
		
	}
	
	void borrowBook(String genre) {
		if(map.containsKey(genre)) {
			BookNode temp=map.get(genre);
			map.put(genre, temp.next);
		}
		else {
			System.out.println("No Book Available");
		} 
	}
	
	void displayCatalog() {
		for(String genre:map.keySet()) {
			System.out.println("Genre : "+genre);
			BookNode temp=map.get(genre);
			if (temp == null) {
	            System.out.println("No book available");
	            continue;
	        }
			while(temp!=null) {
				System.out.println(temp.book);
				temp=temp.next;
			}
		}
	}
	
}
