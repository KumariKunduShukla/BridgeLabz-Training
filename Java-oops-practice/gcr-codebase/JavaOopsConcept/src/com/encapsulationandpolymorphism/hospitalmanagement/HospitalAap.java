package com.encapsulationandpolymorphism.hospitalmanagement;

import java.util.ArrayList;
import java.util.List;

public class HospitalAap {
	public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        patients.add(new InPatient(101, "Amit", 45, 5, 3000));
        patients.add(new OutPatient(102, "Neha", 30, 800));
        patients.add(new OutPatient(103, "Krishna", 30, 9000));
        patients.add(new OutPatient(302, "Kamal", 35, 1800));
        patients.add(new OutPatient(202, "Krish", 45, 8000));
        

        processPatients(patients);
    }

    // method
    public static void processPatients(List<Patient> patients) {

        for (Patient patient : patients) {

            patient.getPatientDetails();
            System.out.println("Total Bill Amount: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.addRecord("Routine check completed");
                record.viewRecords();
            }

            System.out.println("-----------------------------------");
        }
    }
}