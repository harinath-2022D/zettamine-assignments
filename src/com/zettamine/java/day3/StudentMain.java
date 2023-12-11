package com.zettamine.java.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Student> stList = new ArrayList<>();
		
		while(true) {
			System.out.println("Enter student name and email: ");
			String name = sc.nextLine();
			String email = sc.nextLine();
			if(validateEmail(email) && validName(name)) {
			Student stu = new Student(name, email);
			stList.add(stu);
			System.out.print("Do you want to add more students?[Y/N]: ");
			String next = sc.nextLine();
			if(next.equals("N") || next.equals("n")) {
				printData(stList);
			}
			if(!next.equalsIgnoreCase("y")) {
				System.err.println("Invalid .....");
			}
			System.out.println();
			}else {
				System.err.println("Invalid email or name");
			}
		}

	}
	
	private static boolean validName(String name) {
		name = name.trim();
		boolean result = name.matches("^[a-zA-Z\\s]+$");
		return result;
	}

	private static boolean validateEmail(String email) {
		boolean result = email.matches("^[A-Za-z0-9\\._%+-]+@[A-Za-z0-9-]+\\.[A-Za-z]{2,6}$");
		return result;
	}

	private static void printData(List<Student> stList) {
		System.out.printf("ID\t   NAME\t\t    EMAIL\t\t\t   COLLEGE NAME\n");
		System.out.println("-".repeat(80));
		for(Student stu : stList) {
			System.out.printf("%-10s %-15s  %-20s %20s\n",stu.getStudentId(),stu.getStudentName(),stu.getStudentEmail(),stu.getCollegeName());
		}
		System.exit(0);
		
	}

}
