package com.zettamine.java.day6.phone_book;

public class Contact {
	
	private long phoneNum;
	private String firstName;
	private String lastName;
	private String emailId;
	
	public Contact(long No, String firstName, String lastName, String mailId) {
		super();
		this.phoneNum = No;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = mailId;
	}
	public long getNum() {
		return this.phoneNum;
	}


}
