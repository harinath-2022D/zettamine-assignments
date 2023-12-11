package com.zettamine.java.day3;

public class Student {
	private static int id = 100;
	private String studentId ;
	private String studentName;
	private String studentEmail;
	private static String collegeName = "NIT WARANGAL";
	
	public Student(String studentName, String studentEmail) {
		this.studentId = "ZETTA_" + id++;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}
	
	

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}
	
}
