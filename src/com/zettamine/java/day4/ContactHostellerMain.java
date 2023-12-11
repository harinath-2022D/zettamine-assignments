package com.zettamine.java.day4;

import java.util.Scanner;

public class ContactHostellerMain {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Student & Hostel Details: ");
		System.out.print("Student ID: ");
		int id = sc.nextInt();
		System.out.print("Student Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Department Id: ");
		int did = sc.nextInt();
		System.out.print("Gender [M/F]: ");
		String gender = sc.next();
		System.out.print("Phone Number: ");
		String number = sc.next();
		sc.nextLine();
		System.out.print("Hostel Name: ");
		String hostelName = sc.nextLine();
		System.out.print("Room Number: ");
		int roomNum = sc.nextInt();
		
		Hosteller obj = new Hosteller(roomNum, hostelName);
		Student student = new Student(id,name,did,gender,number, obj);
		
		printStudent(student);
		
		

	}

	private static void printStudent(Student obj) {
		System.out.println("-".repeat(30));
		System.out.println("Student ID: " + obj.getStudentId());
		System.out.println("Student Name: " + obj.getName());
		System.out.println("Department Id: " + obj.getDepartmentId());
		System.out.println("Gender [m/F]: " + obj.getGender());
		System.out.println("Phone Number: " + obj.getPhone());
		System.out.println("Hostel Name: " + obj.getHosteller().getHostelName());
		System.out.println("Room No: " + obj.getHosteller().getRoomNum());
		
	}

}
