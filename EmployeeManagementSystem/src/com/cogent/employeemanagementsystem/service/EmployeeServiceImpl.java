package com.cogent.employeemanagementsystem.service;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl{
EmployeeRepository employeeRepository= EmployeeRepositoryImpl.getInstance();

public String addEmployee(Employee employee) {
	
	return employeeRepository.addEmployee(employee);
}
public Employee getEmployeeById(String id) {
	return employeeRepository.getEmployeeByID(id);
}
public Employee[] getEmployees() {
	return employeeRepository.getEmployees();
}
public String deleteEmployeeById(String id) {
	return employeeRepository.deleteEmployeeById(id);
}

private static EmployeeServiceImpl employeeService;
private EmployeeServiceImpl() {}
public static EmployeeServiceImpl getInstance() {
	if(employeeService==null) {
		employeeService = new EmployeeServiceImpl();
		return employeeService;
	}
	return employeeService; 
}
}
