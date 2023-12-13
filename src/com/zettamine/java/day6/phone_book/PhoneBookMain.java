package com.zettamine.java.day6.phone_book;

import java.util.List;
import java.util.Scanner;

public class PhoneBookMain {
	
	private static PhoneBook phone = new PhoneBook();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		printOptions();
		
		
		System.out.print("Enter option: ");
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			
			
			System.out.print("Enter FirstName: ");
			String firstName = sc.nextLine();
			
			sc.nextLine();
			System.out.print("Enter LastName: ");
			String lastName = sc.nextLine();
			
			System.out.print("Enter Phone Num: ");
			long phoneNum = sc.nextLong();
			
			System.out.print("Enter mail Id: ");
			String mail = sc.nextLine();
			
			Contact contact = new Contact(phoneNum,firstName,lastName,mail);
			phone.addContact(contact);
			System.out.print("Contact added");
			break;
		case 2:
			List<Contact> contacts = phone.viewAllContacts();
			for(Contact c : contacts) {
				System.out.println(c);
			}
			break;
		case 3:
			System.out.print("Enter phone number: ");
			long number = sc.nextLong();
			Contact cont = phone.viewContactByPhoneNum(number);
			if(cont != null) {
				System.out.println(cont);
			}else {
				System.out.println("None of the contact available with number: "+number);
			}
			break;
		case 4:
			System.out.print("Enter phone number: ");
			long number1 = sc.nextLong();
			
			if(phone.removeContact(number1)) {
				System.out.println("Contact removed ");
			}
			else {
				System.out.println("No contact available");
			}
			break;
		case 5:
			System.exit(0);
		default:
			System.err.println("Invalid option ----  TRY AGIAN ----");
			break;
			
		}
		
		}// while
	}

	private static void printOptions() {
		System.out.println();
		System.out.println("Menu\n1. Add Contact\n"
				+ "2. Display all Contacts\n"
				+ "3. Search Contact by Number\n"
				+ "4. Remove Contact\n"
				+ "5. Exit\n"
				);
		
	}

}
