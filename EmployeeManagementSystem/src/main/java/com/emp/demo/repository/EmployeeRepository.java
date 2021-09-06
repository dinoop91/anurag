package com.emp.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.emp.demo.entity.Employee;
import com.emp.demo.entity.EmployeeTask;

@Repository
public class EmployeeRepository {
	
	
	public List<Employee> employee = new ArrayList<Employee>();
    public List<EmployeeTask> task = new ArrayList<EmployeeTask>();
    public List<Employee> employeelist = new ArrayList<Employee>();
    
    public  List<Employee> getAllEmployee() 
    {
		
		return employee;
	}


	public Employee getEmployee(int id) 
	{
		
		return employee.stream().filter(i -> i.getId() == id).findFirst().get();
	}
    
	
	public Employee addEmployeeDetails(Employee employeeObject) 
	{
		int flag =0;
		int length = employee.size(); 
		
		for(int count=0 ; count< length; count++) {
			
			if(employee.get(count).getId() == employeeObject.getId()) {
				
				 flag = 1;
			}
		}
	 
		if(flag == 0) {
			
			employee.add(employeeObject);
            return employeeObject;		
		}
		
		
		return null;
		
	}

	
	public Employee editEmployeeDetails(Employee employeeObject) {
	  	employee.stream().filter(i -> i.getId() == employeeObject.getId()).forEach(i ->{ 
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

	
	public List<EmployeeTask> getAllTask() 
    {
		
		return task;
	}


	public List<Employee> getEmployeeDetailsBypagelimit(int limit1, int limit2) {
		
		for(int flag=limit1; flag<=limit2;flag++) {
		
			 employeelist.add(employee.get(flag));
			
		}
		
		
		return employeelist;
	}


	
	
}
