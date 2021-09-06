package com.emp.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emp.demo.entity.Employee;
import com.emp.demo.entity.EmployeeTask;
import com.emp.demo.repository.EmployeeRepository;



@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner{

	@Autowired
	EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		
		employee1.setId(1);employee1.setFirstname("Rahul");employee1.setLastname("Raj");employee1.setAge(24);employee1.setPhoneNumber("9847563211");employee1.setEmail("rahul@gmail.com");employee1.setSalary(240000);employee1.address.setAddressLine("2nd Street");employee1.address.setCity("banglore");employee1.address.setState("Karnataka");employee1.address.setCountry("India");employee1.address.setPincode(567234);
		employee2.setId(2);employee2.setFirstname("Rohit");employee2.setLastname("Sharma");employee2.setAge(28);employee2.setPhoneNumber("8967543213");employee2.setEmail("rohit@gmail.com");employee2.setSalary(26000);employee2.address.setAddressLine("4th avenue");employee2.address.setCity("Mumbai");employee2.address.setState("Mharashtra");employee2.address.setCountry("India");employee2.address.setPincode(456732);
		
		employeeRepository.employee.addAll(Arrays.asList(employee1,employee2));
	
	    EmployeeTask task1 = new EmployeeTask();
	    EmployeeTask task2 = new EmployeeTask();
	    
	    task1.setId(1);task1.setTaskId(1);task1.setProjectName("Security Project");task1.setTask("Security maintanence");task1.setStartDate("01=01-2021");task1.setEndDate("01-03-2021");task1.setLanguage("Java");
	    task2.setId(2);task2.setTaskId(2);task2.setProjectName("Backend Project");task2.setTask("Backend coding");task2.setStartDate("01-03-2021");task2.setEndDate("01-06-2021");task2.setLanguage("Python");
	    
	    employeeRepository.task.addAll(Arrays.asList(task1,task2));
	}

	
}
