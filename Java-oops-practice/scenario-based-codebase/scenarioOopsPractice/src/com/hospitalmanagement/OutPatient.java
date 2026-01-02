package com.hospitalmanagement;

class OutPatient extends Patient {

    OutPatient(int patientId, String name) {
        super(patientId, name);
    }

    @Override
    public void displayInfo() {
        System.out.println("OutPatient: " + name);
    }
}
