package com.zettamine.java.day2;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String studentCollege;
	
	public Student(int id, String name, String address) {
		super();
		this.studentId = id;
		this.studentName = name;
		this.studentAddress = address;
		this.studentCollege = "NIT";
	}
	
	public Student(int id, String name, String address, String college) {
		this(id, name, address);
		this.studentCollege = college;
	}
	
	@Override
	public String toString() {
		System.out.println();
		return "studentId:" + studentId + "\nstudentName:" + studentName + "\nstudentAddress:" + studentAddress
				+ "\nstudentCollege:" + studentCollege;
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentCollege() {
		return studentCollege;
	}
	public void setStudentCollege(String studentCollege) {
		this.studentCollege = studentCollege;
	}
	
	
}
