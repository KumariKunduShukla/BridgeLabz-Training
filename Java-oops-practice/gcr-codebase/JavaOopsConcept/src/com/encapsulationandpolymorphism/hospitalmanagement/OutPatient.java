package com.encapsulationandpolymorphism.hospitalmanagement;

public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        getMedicalHistory().add(record);
        System.out.println("OutPatient medical record added");
    }

    @Override
    public void viewRecords() {
        System.out.println("OutPatient Medical Records: " + getMedicalHistory());
    }
}
