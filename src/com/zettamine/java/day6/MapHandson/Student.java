package com.zettamine.java.day6.MapHandson;

public class Student {
	private String name;
	private String location;
	private String email;
	private long mobile;
	
	public Student(String name, String location, String email, long mobile) {
		super();
		this.name = name;
		this.location = location;
		this.email = email;
		this.mobile = mobile;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	
}
