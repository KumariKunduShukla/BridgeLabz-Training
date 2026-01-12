package com.ambulanceroute;


public class Route {
	private Node head = null;

    // Add hospital unit
    public void addUnit(String name, boolean available) {
        Node newNode = new Node(name, available);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Rotate until an available unit is found
    public void findAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units available.");
            return;
        }

        Node temp = head;

        do {
            if (temp.available) {
                System.out.println("Patient treated at: " + temp.name);
                return;
            } else {
                System.out.println(temp.name + " not available, redirecting...");
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("No available unit found.");
    }

    // Remove unit under maintenance
    public void removeUnit(String name) {
        if (head == null) return;

        Node curr = head;
        Node prev = null;

        do {
            if (curr.name.equals(name)) {

                // Only one node
                if (curr == head && curr.next == head) {
                    head = null;
                    return;
                }

                // Removing head
                if (curr == head) {
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println("Unit removed (Maintenance): " + name);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display circular route
    public void displayRoute() {
        if (head == null) {
            System.out.println("No units in route.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.name + "->" );
            temp = temp.next;
        } while (temp != head);

        System.out.println("(Back to Emergency)");
    }
}