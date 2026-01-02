package com.hospitalmanagement;

public class HospitalManagent {
	public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Rahul", "Diabetes", 5);
        Patient p2 = new InPatient(102, "Roshni", "Reproductive health", 8);
        Patient p3 = new InPatient(103, "Nisha", "Growth problem", 6);
        Patient p4 = new OutPatient(104, "Ankita");

        Doctor d1 = new Doctor("Dr. Sharma", "Cardiology");
        Doctor d2 = new Doctor("Dr. Singh", "Gynecologist");
        Doctor d3 = new Doctor("Dr. Shivam", "Pediatrician");

        Bill bill = new Bill(5000);

        p1.displayInfo(); 
        p2.displayInfo(); 
        p3.displayInfo(); 
        p4.displayInfo();
        d1.displayInfo();
        d2.displayInfo();
        d3.displayInfo();

        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}