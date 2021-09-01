package com.emp.demo.service;

import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Service;

import com.emp.demo.entity.Employee;
import com.emp.demo.entity.EmployeeTask;


@Service
public  class EmployeeService  {
	

	
	public List<Employee> employee = new ArrayList<Employee>();
    public List<EmployeeTask> task = new ArrayList<EmployeeTask>();
	
    
    
	
public String readData(Employee emp3) {
		
		employee.add(emp3);
		return "Data added successfully";
	}
	
public String editData(Employee emp) {
	employee.stream().filter(i -> i.getId() == emp.getId()).forEach(i ->{ 
		i.setFirstname(emp.getFirstname());
		i.setLastname(emp.getLastname());
		i.setAge(emp.getAge());
		i.setAddress(emp.getAddress());
	});
	
	return "Data updated successfully";
	
}

   public List<EmployeeTask> getTask() {
	     return task;
      }

 
   public Employee getEmp( int id) {
	
	   return employee.stream().filter(i -> i.getId() == id).findFirst().get();
}

      public List<Employee> getData() {
	
      	return employee;
   }

 


}






