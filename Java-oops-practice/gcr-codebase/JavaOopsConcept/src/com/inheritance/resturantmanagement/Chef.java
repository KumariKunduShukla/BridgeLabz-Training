package com.inheritance.resturantmanagement;

//Chef class inherits Person and implements Worker
public class Chef extends Person implements Worker {

    // Chef-specific attribute
    private String specialty;

    public Chef(String name, int id, String specialty) {
      super(name, id);
      this.specialty = specialty;
    }

    @Override
    public void performDuties() {
      System.out.println("Chef is cooking " + specialty + " dishes.");
 }
}
