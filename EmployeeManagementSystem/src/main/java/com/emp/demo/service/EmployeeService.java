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
		
		return employeeRepository.employee;
	}
	
	
    public Employee addEmployeeDetails(Employee employeeObject)
    {
		
    	int flag =0;
		int length = employeeRepository.employee.size(); 
		
		for(int count=0 ; count< length; count++) {
			
			if(employeeRepository.employee.get(count).getId() == employeeObject.getId()) {
				
				 flag = 1;
			}
		}
	 
		if(flag == 0) {
			
			employeeRepository.employee.add(employeeObject);
            
			return employeeObject;		
		}
	
		return null;
    }
	

    public Employee editEmployeeDetails(Employee employeeObject) {
	    
    	employeeRepository.employee.stream().filter(i -> i.getId() == employeeObject.getId()).forEach(i ->{ 
			i.setFirstname(employeeObject.getFirstname());
			i.setLastname(employeeObject.getLastname());
			i.setAge(employeeObject.getAge());
			i.address.setAddressLine(employeeObject.address.getAddressLine());
			i.address.setCity(employeeObject.address.getCity());
			i.address.setState(employeeObject.address.getState());
			i.address.setCountry(employeeObject.address.getCountry());
			i.address.setPincode(employeeObject.address.getPincode());
		});
		
		    return employeeObject;
		
    }
    
  
    
    
    public Employee getEmployee( int id) 
    {
    	
 	    return employeeRepository.employee.stream().filter(i -> i.getId() == id).findFirst().get();
    }
    
    

   public List<EmployeeTask> getAllTask() 
   {
	     
	   return employeeRepository.task;
   }


   public List<Employee> getEmployeeDetailsByPagelimit(int limit1, int limit2) {
	
	   for(int flag=limit1; flag<=limit2;flag++) {
			
			 employeeRepository.employeelist.add(employeeRepository.employee.get(flag));
			
		}
		
		
		return employeeRepository.employeelist;
	}


	
	   
	   
   }



 







