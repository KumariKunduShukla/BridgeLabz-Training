package com.inheritance.resturantmanagement;

//Waiter class inherits Person and implements Worker
public class Waiter extends Person implements Worker {

   // Waiter-specific attribute
   private int tableCount;

    public Waiter(String name, int id, int tableCount) {
       super(name, id);
       this.tableCount = tableCount;
 }

    @Override
    public void performDuties() {
      System.out.println("Waiter is serving " + tableCount + " tables.");
 }
}
