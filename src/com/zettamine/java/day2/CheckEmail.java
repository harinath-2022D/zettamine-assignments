package com.zettamine.java.day2;

import java.util.Scanner;

public class CheckEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// check whether the enter email is valid or not
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your email: ");
		String email = sc.nextLine();
		email = email.trim();
		
		if(validateEmail(email)) {
			System.out.println("Valid email");
		}else {
			System.out.println("Invalid email");
		}
		
	}

	private static boolean validateEmail(String email) {
		boolean result = email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
		return result;
	}

}
