package com.objectmodeling;

public class CompanyComposition {
	public static void main(String[] args) {

        Company company = new Company("Tech Solutions");

        Department devDept = new Department("Development");
        devDept.addEmployee(101, "Amit");
        devDept.addEmployee(102, "Riya");
        devDept.addEmployee(103, "Utkarsh");
        devDept.addEmployee(104, "Anuj");
        devDept.addEmployee(105, "Kundu");


        Department hrDept = new Department("HR");
        hrDept.addEmployee(201, "Neha");
        hrDept.addEmployee(202, "Yashraj");
        hrDept.addEmployee(203, "Raman");

        company.addDepartment(devDept);
        company.addDepartment(hrDept);

        company.displayCompanyDetails();

        // When company object is removed,
        // departments and employees are also removed automatically
        company = null;

        System.out.println("\nCompany deleted. Departments and Employees no longer exist.");
    }
}