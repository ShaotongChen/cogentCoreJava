package com.cogent.employeemanagementsystem.service;

import com.cogent.employeemanagementsystem.model.Employee;

public interface EmployeeService {

	
	
	public String addEmployee(Employee employee);
	public String deleteEmployeeById(String id);
	public void deleteAllEmployees();
	public Employee getEmployeeByID(String id);
	public Employee[] getEmployees();
	public String upddateEmployee(String id, Employee employee);
	
}
