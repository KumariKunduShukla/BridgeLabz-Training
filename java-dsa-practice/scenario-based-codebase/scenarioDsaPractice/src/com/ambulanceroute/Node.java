package com.ambulanceroute;

public class Node {
	String name;
    boolean available;
    Node next;

    Node(String name, boolean available) {
        this.name = name;
        this.available = available;
        this.next = null;
    }
}