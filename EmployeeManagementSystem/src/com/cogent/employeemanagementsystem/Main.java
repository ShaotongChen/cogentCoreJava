package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
	
	
	  	EmployeeServiceImpl employeeService = EmployeeServiceImpl.getInstance();
	 
		Employee employee = new Employee("shaotong", "shao","chen",100.0f,"IL","computer");
		Employee employee1 = new Employee("shaotong1", "shao","chen",100.0f,"IL","computer");
		Employee employee2 = new Employee("shaotong2", "shao","chen",100.0f,"IL","computer");
		Employee employee3 = new Employee("shaotong3", "shao","chen",100.0f,"IL","computer");
		Employee employee4 = new Employee("shaotong4", "shao","chen",100.0f,"IL","computer");
		Employee employee5 = new Employee("shaotong5", "shao","chen",100.0f,"IL","computer");
		Employee employee6 = new Employee("shaotong6", "shao","chen",100.0f,"IL","computer");
		Employee employee7 = new Employee("shaotong7", "shao","chen",100.0f,"IL","computer");
		Employee employee8 = new Employee("shaotong8", "shao","chen",100.0f,"IL","computer");
		Employee employee9 = new Employee("shaotong9", "shao","chen",100.0f,"IL","computer");
		employeeService.addEmployee(employee);
		employeeService.addEmployee(employee1);
		employeeService.addEmployee(employee2);
		employeeService.addEmployee(employee3);
		employeeService.addEmployee(employee4);
		employeeService.addEmployee(employee5);
		employeeService.addEmployee(employee6);
		employeeService.addEmployee(employee7);
		employeeService.addEmployee(employee8);
		
		employeeService.addEmployee(employee9);
		
		
		
	//System.out.println(employeeService.deleteEmployeeById("shaotong6"));
		
		
		Employee[] employees = employeeService.getEmployees();
		//employeeService.deleteAllEmployees();
		Employee employeeT= new Employee("sisi","add","min",1000.0f,"PA","management");
		employeeService.upddateEmployee("shaotong8", employeeT);
		for(Employee employe : employees) {
			System.out.println(employe);
		}
	}

}
