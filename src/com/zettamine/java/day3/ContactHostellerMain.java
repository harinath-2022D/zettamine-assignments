package com.zettamine.java.day3;

import java.util.Scanner;
/**
 * contact hosteller case study with abstract
 */
public class ContactHostellerMain {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Hosteller obj = getHostllerDetails();
		
		System.out.print("Modify Room Number [Y/N]: ");
		String modifyRoom = sc.next();
		int newRoomNum = 0;
		if(modifyRoom.equalsIgnoreCase("y")) {
			System.out.print("New Room Number: ");
			newRoomNum = sc.nextInt();
			obj.setRoomNum(newRoomNum);
		}
		System.out.print("Modify Phone Number [Y/N]: ");
		String modifyPhone = sc.next();
		String newPhoneNum = "";
		if(modifyPhone.equals("y")) {
			System.out.print("New Phone Number: ");
			newPhoneNum = sc.next();
			obj.setPhoneNum(newPhoneNum);
		}
	
		printDetails(obj);
		
		

	}
	public static Hosteller getHostllerDetails() {
		Hosteller obj = new Hosteller();
		
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
		System.out.print("Hostel Name: ");
		String hostelName = sc.nextLine();
		obj.setHostelName(hostelName);
		sc.nextLine();
		System.out.print("Room Number: ");
		int roomNum = sc.nextInt();
		
		obj.setDepartmentId(did);
		obj.setGender(gender);
		obj.setHostelName(hostelName);
		obj.setId(id);
		obj.setName(name);
		obj.setPhoneNum(number);
		obj.setRoomNum(roomNum);
		
		return obj;
	}

	private static void printDetails(Hosteller obj) {
		System.out.println("-".repeat(30));
		System.out.println("Student ID: " + obj.getId());
		System.out.println("Student Name: " + obj.getName());
		System.out.println("Department Id: " + obj.getDepartmentId());
		System.out.println("Gender [m/F]: " + obj.getGender());
		System.out.println("Phone Number: " + obj.getPhoneNum());
		System.out.println("Hostel Name: " + obj.getHostelName());
		System.out.println("Room No: " + obj.getRoomNum());
		
	}

}
