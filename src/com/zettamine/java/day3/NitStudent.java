package com.zettamine.java.day3;

public class NitStudent {
	protected int id;
	protected String name;
	protected int departmentId;
	protected String gender;
	protected String phoneNum;
	public NitStudent(int id, String name, int departmentId, String gender, String phoneNum) {
		super();
		this.id = id;
		this.name = name;
		this.departmentId = departmentId;
		this.gender = gender;
		this.phoneNum = phoneNum;
	}
	public NitStudent() {
		super();
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public String getGender() {
		return gender;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}
