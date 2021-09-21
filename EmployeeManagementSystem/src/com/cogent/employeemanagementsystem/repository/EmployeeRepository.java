package com.cogent.employeemanagementsystem.repository;

import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepository {

	private Employee[] employees = new Employee[10];
	int counter= -1;
	private static EmployeeRepository employeeRepository;
	private EmployeeRepository() {
		
		
	}
	public static EmployeeRepository getInstance() {
		if(employeeRepository==null) {
			employeeRepository= new EmployeeRepository();
			return employeeRepository;
		}
		return employeeRepository;
	}
	public String addEmployee(Employee employee) {
		if(counter>employees.length) {
			return "the array is full";
		}
		employees[++counter]= employee;
		return "success!";
	}
	public Employee getEmployeeByID(String id) {
		for(Employee employee: employees) {
			if( employee!=null && id.equals(employee.getEmployeeID())) {
				return employee;
			}
			
		}
		return null;
		
	}
}
