package com.zettamine.java.day2;

public class Loan {
	
	public double calculateLoanAmount(Employee emp) {
		double salary = emp.getSalary();
		if(emp instanceof PermanentEmployee) {
			System.out.println("-----");
			return salary * 0.15;
		}
		else {
			return salary * 0.10;
		}
	}

}
