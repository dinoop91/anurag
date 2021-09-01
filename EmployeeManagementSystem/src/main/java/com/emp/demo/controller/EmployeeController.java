package com.emp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/home")
public class EmployeeController {
	
	@Autowired 
	EmployeeService employeeService;
	
	
	
	@PostMapping("/read/data")
	public String readData(@RequestBody Employee emp3) {
		
		return employeeService.readData(emp3);
		
	}
	
	
	@GetMapping("/get/data")
	public List<Employee> getData(){
	    return employeeService.getData();
	} 
	
	
	
	@PutMapping("/edit/data")
	public String editData(@RequestBody Employee emp) {
		
		return employeeService.editData(emp);
	}
	
	@GetMapping("/get/task")
	public  List<EmployeeTask> getTask(){
		return employeeService.getTask();
	}


    @GetMapping("/get/{id}") 
    public Employee getEmp(@PathVariable ("id") int id) {
    		
            return employeeService.getEmp(id);
    }

}
