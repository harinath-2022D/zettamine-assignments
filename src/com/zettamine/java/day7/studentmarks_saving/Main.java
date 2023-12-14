package com.zettamine.java.day7.studentmarks_saving;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	public static Student[] arr;

	public static void main(String[] args) {

		acceptData();
		Student.displayData();
		studentDataSave();

	}

	public static void acceptData() {
		System.out.print("Enter number of students: ");
		int num = sc.nextInt();
		arr = new Student[num];
		System.out.printf("Accepting %d details.\n", num);

		int temp = 0;
		while (num > 0) {
			Student stu = new Student();
			
			sc.nextLine();
			System.out.print("Enter roll number: ");
			String rollNum = sc.nextLine();
			stu.setRollNum(rollNum);

			
			System.out.print("Enter name of the student: ");
			String name = sc.nextLine();
			stu.setName(name);

			System.out.print("Enter no of subjects: ");
			int noOfSub = sc.nextInt();
			int i = 1;
			while (noOfSub > 0) {
				System.out.print("Enter marks for subject-" + i + ": ");
				int marks = sc.nextInt();
				stu.addSubMarksHS(marks);
				stu.addSubMarksTS(marks);
				i++;
				noOfSub--;
			}

			arr[temp++] = stu;
			num--;
		}

	}

	private static void studentDataSave() {
		try {
			FileWriter file = new FileWriter("C:\\Users\\Harinath\\Desktop\\CustFolder\\StudentData.txt", true);
			BufferedWriter bw = new BufferedWriter(file);
			
			for(int i = 0; i < arr.length; i++) {
				String str = arr[i].toString();
				System.out.println(str);
				bw.write(str);
			}
			bw.close();
			file.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
