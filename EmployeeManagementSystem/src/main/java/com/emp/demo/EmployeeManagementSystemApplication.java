package com.emp.demo;

import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emp.demo.entity.Employee;
import com.emp.demo.entity.EmployeeTask;
import com.emp.demo.service.EmployeeService;


@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

	
	@Autowired
	EmployeeService employeeService;
	
	
	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = new Employee(1, "Rahul", "Tripati", 25, "Delhi");
		Employee employee2 = new Employee(2, "Rohit", "sharma", 30, "Mumbai");
		Employee employee3 = new Employee(3, "virat", "kohli", 31, "Banglore");
		Employee employee4 = new Employee(4, "Rishab", "pant", 23, "Mumbai");
		Employee employee5 = new Employee(5, "Jasprit", "Bumrah", 28, "Mumbai");
		Employee employee6 = new Employee(6, "Surya", "Yadav", 34, "Mumbai");
		Employee employee7 = new Employee(7, "sanju", "samson", 27, "Rajasthan");
		Employee employee8 = new Employee(8, "Shikar", "Dhawan", 32, "Pune");
		employeeService.employee.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6,employee7,employee8));
		
		
		EmployeeTask task1 = new EmployeeTask(1, "practicing");
		EmployeeTask task2 = new EmployeeTask(2, "doing the job");
		employeeService.task.addAll(Arrays.asList(task1,task2));
	
	}

}
