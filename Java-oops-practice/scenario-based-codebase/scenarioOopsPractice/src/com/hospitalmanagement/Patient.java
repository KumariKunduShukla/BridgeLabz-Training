package com.hospitalmanagement;

public class Patient {
	// attributes
	protected int patientId;
    protected String name;
    private String medicalHistory;

    // Normal admission
    Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = "Not Provided";
    }

    // Emergency admission (Overloaded Constructor)
    Patient(int patientId, String name, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "Patient ID: " + patientId + ", Name: " + name;
    }

    public void displayInfo() {
        System.out.println("Patient Name: " + name);
    }
}