package com.emp.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.demo.entity.Employee;
import com.emp.demo.entity.EmployeeTask;
import com.emp.demo.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired 
	EmployeeService employeeService;
	
	
	@GetMapping("/get/all")
	public List<Employee> employeeDetails()
	{
		return employeeService.getAllEmpoyee();
	}
	
	
	@GetMapping("/get/{start}/{end}")
	public List<Employee> employeeDetailsByPagelimit(@PathVariable("start") int limit1, @PathVariable("end") int limit2)
	{
	    return employeeService.getEmployeeDetailsByPagelimit( limit1, limit2);	
	} 
	
	
	@PostMapping("/create")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		Employee employeeAdded= employeeService.addEmployeeDetails(employee);
		
			return employeeAdded;
		
	}
	
	
	@PutMapping("/edit")
	public Employee editEmployee(@RequestBody Employee employee) 
	{
		Employee employeeEdited= employeeService.editEmployeeDetails(employee);
	    return employeeEdited;
	}
	
	
	@GetMapping("/get/{id}") 
	public Employee getEmployeeById(@PathVariable ("id") int id) 
	{
	    return employeeService.getEmployee(id);
	}
    
	
	@GetMapping("get/task")
	public List<EmployeeTask> getAllTask()
	{
		return employeeService.getAllTask();
	} 
   
}
