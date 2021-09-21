package com.cogent.employeemanagementsystem.service;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;

public class EmployeeService {
EmployeeRepository employeeRepository= new EmployeeRepository();

public String addEmployee(Employee employee) {
	
	return employeeRepository.addEmployee(employee);
}
public Employee getEmployeeById(String id) {
	return employeeRepository.getEmployeeByID(id);
}
public static EmployeeRepository getInstance() {
	
	return EmployeeRepository.getInstance();
}
}
