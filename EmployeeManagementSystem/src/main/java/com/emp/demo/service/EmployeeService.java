package com.emp.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.demo.entity.Employee;
import com.emp.demo.entity.EmployeeTask;
import com.emp.demo.repository.EmployeeRepository;


@Service
public  class EmployeeService  {
	

	@Autowired
	EmployeeRepository employeeRepository;
	
    
	
	public List<Employee> getAllEmpoyee()
    {
		
		return employeeRepository.getAllEmployee();
	}
	
	
    public Employee addEmployeeDetails(Employee employeeObject)
    {
		
		return employeeRepository.addEmployeeDetails(employeeObject);
	
    }
	

    public Employee editEmployeeDetails(Employee employeeObject) {
	    
    	return employeeRepository.editEmployeeDetails(employeeObject);
    }
    
    public Employee getEmployee( int id) 
    {
    	
 	    return employeeRepository.getEmployee(id);
    }
    
    

   public List<EmployeeTask> getAllTask() 
   {
	     
	   return employeeRepository.getAllTask();
   }


   public List<Employee> getEmployeeDetailsByPagelimit(int limit1, int limit2) {
	
	return employeeRepository.getEmployeeDetailsBypagelimit(limit1,limit2);
   }



 
}






