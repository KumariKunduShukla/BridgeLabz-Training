package com.encapsulationandpolymorphism.employeemanagement;

//Part-time employee class
public class PartTimeEmployee extends Employee implements Department {

    private int workHours;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int workHours) {
       super(employeeId, name, hourlyRate);
       this.workHours = workHours;
    }

 
    @Override
    public double calculateSalary() {
       return getBaseSalary() * workHours;
     }


     @Override
     public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

     @Override
     public String getDepartmentDetails() {
      return department;
    }
}
