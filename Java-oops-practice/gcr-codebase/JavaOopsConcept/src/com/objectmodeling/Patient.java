package com.objectmodeling;

import java.util.ArrayList;
import java.util.List;

public class Patient {
	private int id;
    private String name;
    private List<Doctor> consultedDoctors;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
        this.consultedDoctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        consultedDoctors.add(doctor);
    }

    public void viewConsultedDoctors() {
        System.out.println("Patient: " + name);
        for (Doctor d : consultedDoctors) {
            System.out.println("  Consulted Doctor: " + d.getName());
        }
    }
}