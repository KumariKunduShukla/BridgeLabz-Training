package com.hospitalmanagement;

class InPatient extends Patient {
    private int daysAdmitted;

    InPatient(int patientId, String name, String medicalHistory, int daysAdmitted) {
        super(patientId, name, medicalHistory);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient: " + name + ", Days Admitted: " + daysAdmitted);
        
    }
}
