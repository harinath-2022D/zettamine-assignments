package com.zettamine.java.day1;

import java.util.Scanner;

public class ReportCard {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("enter student name :");
		String name = sc.nextLine();
		System.out.print("enter number of subjects :");
		int noOfSubjects = sc.nextInt();
		
		int[] marks = new int[noOfSubjects];
		String[] subjects = new String[noOfSubjects];
		
		marksEntry( marks, subjects);
		
		sc.close();
		
		
		
		printReportCard(name, marks, subjects);
	}
	
	public static void marksEntry(int[] arr, String[] subjects) {
		
		for(int i = 1; i <= arr.length; i++) {
			String sub = enterSub();
			//System.out.print("enter mark for subject-"+i+" :");
			subjects[i-1] = sub;
			sc.nextLine();
			System.out.print("enter mark for " + sub +": ");
			arr[i-1] = sc.nextInt();
		}
	}
	
	private static String enterSub() {
		System.out.print("enter subject name: ");
		String sub = sc.nextLine();
		return sub;
	}

	public static void printReportCard(String name, int[] marks, String[] subjects) {
		int totalMarks = 0;
		System.out.println("-".repeat(30));
		System.out.println("\tREPORT CARD");
		System.out.println("NAME: " + name);
		System.out.println("-".repeat(30));
		System.out.println("SUBJECT \t MARK");
		System.out.println("-".repeat(30));
		for(int i = 1; i <= marks.length; i++) {
			totalMarks += marks[i-1];
			//System.out.println("Subject-"+i+"\t "+marks[i-1]);
			System.out.println(subjects[i-1]+ "\t "+marks[i-1]);
		}
		float avg = (float) totalMarks/marks.length;
		System.out.println("-".repeat(30));
		System.out.printf("TOTAL:"+totalMarks+"\t AVERAGE:%.2f",avg );
		System.out.printf("\n------------------------------");
	}
	
	
}
