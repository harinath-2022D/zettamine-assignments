package com.zettamine.java.day7.studentmarks_saving;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Student {
	
	private String roolNo;
	private String stuName;
	private Set<Integer> subMarksHS;
	private Set<Integer> subMarksTS;
	
	public Student() {
		this.subMarksHS = new HashSet<>();
		this.subMarksTS = new TreeSet<>();
	}
	
	public void setRollNum(String num) {
		this.roolNo = num;
	}
	
	public void setName(String name) {
		this.stuName = name;
	}

	public void addSubMarksHS(int marks) {
		this.subMarksHS.add(marks);
	}

	public void addSubMarksTS(int marks) {
		this.subMarksTS.add(marks);
	}

	public void setRoolNo(String roolNo) {
		this.roolNo = roolNo;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public static void displayData() {
		Student[] arr = Main.arr;
		System.out.printf("Displaying %d students details\n",arr.length);
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println("Student name: " + arr[i].stuName);
			System.out.println("Roll No: " + arr[i].roolNo);
			System.out.println("Subject marks: ");
			for(int marks : arr[i].subMarksHS) {
				System.out.println(marks);
			}
			System.out.println("Subject marks in sorted order: ");
			for(int marks : arr[i].subMarksTS) {
				System.out.println(marks);
			}
		}
		
	}

	@Override
	public String toString() {
		return "Student [roolNo=" + roolNo + ", stuName=" + stuName + ", subMarksHS=" + subMarksHS + ", subMarksTS="
				+ subMarksTS + "]";
	}
	
}
