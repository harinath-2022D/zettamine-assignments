package com.zettamine.java.day4;

public class SavingsAccount extends Account {
	
	private double minimumBalance;

	public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public boolean withDraw(double amount) {
		if(super.getBalance() - amount > minimumBalance) {
			super.setBalance(super.getBalance() - amount);
			return true;
		}
		return false;
	}

}
