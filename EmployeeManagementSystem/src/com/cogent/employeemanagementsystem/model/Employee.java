package com.cogent.employeemanagementsystem.model;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Employee {

	private String EmployeeID;
	private String firstName;
	private String lastName;
	private float empSalary;
	private String address;
	private String department;
	public Employee() {
	
	}
 
	

}
