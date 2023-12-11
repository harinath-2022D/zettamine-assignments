package com.zettamine.java.day2;

public abstract class Employee {
	
	protected int employeeId;
	protected String employeename;
	protected double salary;
	
	public Employee(int empId, String name) {
		this.employeeId = empId;
		this.employeename = name;
	}
	
	public abstract void calculateSalary();

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
