package com.zettamine.java.day2;

import java.util.Scanner;

public class CheckValidMobileNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mobile Number: ");
		String number = sc.nextLine();
		
		if(isValid(number)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

	private static boolean isValid(String number) {
		boolean result = number.matches("^6|7|8|9[0-9]{9}$");
		return result;
	}

}
