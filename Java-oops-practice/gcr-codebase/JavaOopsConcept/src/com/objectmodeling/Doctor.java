package com.objectmodeling;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private int id;
    private String name;
    private List<Patient> patients;

    public Doctor(int id, String name) {
        this.id = id;
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Communication method
    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);

        System.out.println("Consultation:");
        System.out.println("  Doctor " + name + " is consulting Patient " + patient.getName());
    }

    public void viewPatients() {
        System.out.println("Doctor: " + name);
        for (Patient p : patients) {
            System.out.println("  Patient: " + p.getName());
        }
    }
}


