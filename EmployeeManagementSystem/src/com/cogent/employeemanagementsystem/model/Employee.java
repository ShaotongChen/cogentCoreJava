package com.cogent.employeemanagementsystem.model;
import lombok.AllArgsConstructor;
import lombok.Data;
//@Data
@AllArgsConstructor
public class Employee {
public float calculateSalary() {
	return empSalary+ 500;
}
	public Employee(String employeeID, String firstName, String lastName, float empSalary, String address
		) {
		super();
		EmployeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empSalary = empSalary;
		this.address = address;
		
	}
	private String EmployeeID;
	private String firstName;
	private String lastName;
	private float empSalary;
	private String address;
	private String department;
	public Employee() {
	System.out.println("welcome employee constructor");
	}
	public String getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
 
	

}
