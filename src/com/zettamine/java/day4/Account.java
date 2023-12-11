package com.zettamine.java.day4;

public abstract class Account {
	
	protected int accountNumber;
	protected Customer customerObj;
	protected double balance;
	
	public Account(int accountNumber, Customer customerObj, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerObj = customerObj;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * abstract method
	 * @param amount
	 * @return true or false
	 */
	public abstract boolean withDraw(double amount);

}
