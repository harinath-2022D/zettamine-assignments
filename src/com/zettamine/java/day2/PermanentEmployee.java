package com.zettamine.java.day2;

public class PermanentEmployee extends Employee{

	private double basicPay;
	
	public PermanentEmployee(int empId, String name, double basicpay) {
		super(empId, name);
		this.basicPay = basicpay;
		calculateSalary();
		
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	@Override
	public void calculateSalary() {
		double pf = this.basicPay * 0.12;
		
		double salary = getBasicPay() - pf;
		
		super.setSalary(salary);
		
	}
	
	
}
