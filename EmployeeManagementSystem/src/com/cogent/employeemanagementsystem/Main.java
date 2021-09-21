package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee employee = new Employee("shaotong", "shao","chen",100.0f,"IL","computer");
		String result = employeeService.addEmployee(employee);
		System.out.println(result);
	}

}
