package com.zettamine.java.day1;

import java.util.Scanner;

public class StringConcat {
	private static String COLOR_RED = "\u001B[31m";
	private static String RESET_COLOR = "\u001B[0m";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inmate's name: ");
		String residentsName = sc.nextLine();
		System.out.print("Inmate's father's name: ");
		String fathersName = sc.nextLine();

//		if(isNameValid(residentsName) && isNameValid(fathersName)) {
//			System.out.println(residentsName.concat(" ").concat(fathersName).toUpperCase());
//		}else {
//			System.out.println(COLOR_RED + "Invalid name" + RESET_COLOR);
//		}

		if (isValidName(residentsName) && isValidName(fathersName)) {
			System.out.println(residentsName.concat(" ").concat(fathersName).toUpperCase());
		} else {
			System.out.println(COLOR_RED + "Invalid name" + RESET_COLOR);
		}
	}

	private static boolean isValidName(String name) {
		boolean result = name.matches("^[a-zA-z ]$");
		return result;
	}

	private static boolean isNameValid(String name) {
		name = name.trim();
		String[] arr = name.split(" ");
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length(); i++) {
				if (!Character.isLetter(arr[j].charAt(i))) {
					return false;
				}
			}
		}

		return true;
	}

}
