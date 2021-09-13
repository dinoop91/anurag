
package com.emp.demo.repository;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.emp.demo.entity.Employee;
import com.emp.demo.entity.EmployeeTask;

@Repository
public class EmployeeRepository {
	
	
	public List<Employee> employee = new ArrayList<Employee>();
    public List<EmployeeTask> task = new ArrayList<EmployeeTask>();
    public List<Employee> employeelist = new ArrayList<Employee>();
    
    

	
	
}
