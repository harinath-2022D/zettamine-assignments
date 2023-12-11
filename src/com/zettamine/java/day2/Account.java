package com.zettamine.java.day2;

public class Account {
	
	private long accountNo;
	private String name;
	private float balance;
	
	
	public Account(long accountNo, String name, float balance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	public Account() {
		super();
	}
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public String deposit(float depositAmount) {
		this.balance += depositAmount;
		return depositAmount + " credited to a/c: " + this.accountNo + " | BALANCE: " + this.balance;
	}
	public String withdraw(float withdrawAmount) {
		this.balance -= withdrawAmount;
		return withdrawAmount + " debited to a/c: " + this.accountNo + " | BALANCE: " + this.balance;
	}
	
	public String getDetails() {
		return "A/C NO: " + this.accountNo + " | NAME: " + this.name + " | BALANCE: " + this.balance;
	}
	
}
