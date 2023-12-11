package com.zettamine.java.day2;

public class TemporaryEmployee extends Employee {
	
	private int  hoursWorked;
	private int hourlyWages;
	
	public TemporaryEmployee(int empId, String name, int hworked, int hwages) {
		super(empId, name);
		this.hoursWorked = hworked;
		this.hourlyWages = hwages;
		calculateSalary();
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	@Override
	public void calculateSalary() {
		super.setSalary(hourlyWages * hoursWorked);
		
	}
	
	

}
