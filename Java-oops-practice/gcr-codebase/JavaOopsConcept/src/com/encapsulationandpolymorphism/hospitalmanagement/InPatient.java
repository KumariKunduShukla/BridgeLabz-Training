package com.encapsulationandpolymorphism.hospitalmanagement;

public class InPatient extends Patient implements MedicalRecord {

    private int numberOfDays;
    private double dailyCharge;

    public InPatient(int id, String name, int age, int days, double dailyCharge) {
        super(id, name, age);
        this.numberOfDays = days;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return numberOfDays * dailyCharge;
    }

    @Override
    public void addRecord(String record) {
        getMedicalHistory().add(record);
        System.out.println("InPatient medical record added");
    }

    @Override
    public void viewRecords() {
        System.out.println("InPatient Medical Records: " + getMedicalHistory());
    }
}
