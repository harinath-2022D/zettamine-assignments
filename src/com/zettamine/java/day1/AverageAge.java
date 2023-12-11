package com.zettamine.java.day1;

import java.util.Scanner;

public class AverageAge {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter total no. of employees: ");
		int noOfEmployees = sc.nextInt();

		if (noOfEmployees < 2) {
			System.err.print("Please enter a valid employee count");
			System.exit(1);
		}

		int[] ages = new int[noOfEmployees];
		calculateAverage(ages);

	}

	private static void calculateAverage(int[] ages) {
		
		int totalAge = 0;

		for (int i = 0; i < ages.length; i++) {
			int age = sc.nextInt();
			if (age < 28 || age > 40) {
				System.err.print("Invalid age encountered!");
				System.exit(1);
			}
			ages[i] = age;
			totalAge += age;
		}

		float avgAge = (float) totalAge / ages.length;
		System.out.printf("The average age is %.2f", avgAge);

	}

}
