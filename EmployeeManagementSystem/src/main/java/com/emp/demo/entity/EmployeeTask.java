package com.emp.demo.entity;

public class EmployeeTask {
	private int id;
	private String task;
	
	
	public EmployeeTask() {
		super();
		
	}
	
	public EmployeeTask(int id, String task) {
		super();
		this.id = id;
		this.task = task;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	
}
