package com.objectmodeling;

public class HospitalManagement {
	 
	public static void main(String[] args) {

	Hospital hospital = new Hospital("City Care Hospital");

    Doctor d1 = new Doctor(101, "Dr. Singh");
    Doctor d2 = new Doctor(102, "Dr. Kumar");

    Patient p1 = new Patient(1, "Kartik");
    Patient p2 = new Patient(2, "Sherya");
    Patient p3 = new Patient(3, "Kamal");
    Patient p4 = new Patient(4, "Krishna");

    hospital.addDoctor(d1);
    hospital.addDoctor(d2);

    hospital.addPatient(p1);
    hospital.addPatient(p2);
    hospital.addPatient(p3);
    hospital.addPatient(p4);

    // Consultations (many-to-many)
    d1.consult(p1);
    d1.consult(p2);

    d2.consult(p3);
    d2.consult(p4);


    System.out.println();

    d1.viewPatients();
    d2.viewPatients();
    System.out.println();

    p1.viewConsultedDoctors();
    p2.viewConsultedDoctors();
  }
	
}