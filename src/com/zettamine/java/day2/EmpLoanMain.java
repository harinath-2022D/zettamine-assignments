package com.zettamine.java.day2;

public class EmpLoanMain {

	public static void main(String[] args) {
		Employee emp = new PermanentEmployee(123, "",10000.00);
		Employee emp1 = new TemporaryEmployee(123, "abc",8,100);
		
		Loan loan = new Loan();
		double loanAmt = loan.calculateLoanAmount(emp1);
		System.out.println(loanAmt);

	}

}
