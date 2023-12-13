package com.zettamine.java.day6.MapHandson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	private static List<Student> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		addStudent();
		sc.close();
		printReport();
	}

	private static void addStudent() {
		
		System.out.print("Enter Student's Name,Location,Email and Mobile: ");
		String input = sc.nextLine();
		System.out.print("Do you want add more students [Y/N]: ");
		String nextOption = sc.next();
		
		String[] arr = input.split(" ");
		
		Student stu = new Student(arr[0],arr[1].toLowerCase(),arr[2],Long.parseLong(arr[3]));
		list.add(stu);
		
		if(nextOption.equalsIgnoreCase("y")) {
			sc.nextLine();
			addStudent();
		}
	}

	private static void printReport() {
		System.out.println();
		Map<String, Integer> report = StudentReport.getReport(list);
		System.out.printf("%-20s %s\n" ,"Location","Count");
		
		System.out.println("-".repeat(25));
		for(String key : report.keySet()) {
			System.out.printf("%-20s %d\n" ,key,report.get(key));
		}
		
	}

}
