package com.browserbuddy;

public class BrowserTab {
	 private Node head;
	    private Node current;

	    // Open first page
	    public BrowserTab(String homepage) {
	        head = new Node(homepage);
	        current = head;
	    }

	    // Visit new page
	    public void visit(String url) {
	        Node newNode = new Node(url);
	        current.next = newNode;
	        newNode.prev = current;
	        current = newNode;
	        System.out.println("Visited: " + url);
	    }

	    // Go back
	    public void back() {
	        if (current.prev != null) {
	            current = current.prev;
	            System.out.println("Back to: " + current.url);
	        } else {
	            System.out.println("No previous page");
	        }
	    }

	    // Go forward
	    public void forward() {
	        if (current.next != null) {
	            current = current.next;
	            System.out.println("Forward to: " + current.url);
	        } else {
	            System.out.println("No forward page");
	        }
	    }

	    public String getCurrentPage() {
	        return current.url;
	    }
	}