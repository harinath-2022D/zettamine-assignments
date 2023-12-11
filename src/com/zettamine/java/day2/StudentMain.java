package com.zettamine.java.day2;

import java.util.Scanner;

public class StudentMain {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter Student id: ");
		int id = sc.nextInt();
		System.out.print("Enter Student name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Enter Student address: ");
		String address = sc.nextLine();
		takeInputForCollege(id, name, address);
	}
	private static void takeInputForCollege(int id, String name, String address) {
		System.out.print("Whether the student is from NIT(Yes/No): ");
		String check = sc.next();
		if(check.equals("NO") || check.equals("no")) {
			System.out.print("Enter the college name: ");
			sc.nextLine();
			String college = sc.nextLine();
			Student stu = new Student(id,name,address,college);
			System.out.print(stu.toString());
		}else if(check.equals("YES") || check.equals("yes")) {
			Student stu = new Student(id, name, address);
			System.out.print(stu.toString());
		}else {
			System.err.println("Wrong input");
			takeInputForCollege(id, name, address);
		}
		
	}

}
