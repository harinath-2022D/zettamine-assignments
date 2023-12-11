package com.zettamine.java.day4;

import java.util.Scanner;

public class AccountManipulatioin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter account number: ");
		int accountNum = sc.nextInt();
		System.out.print("enter customer id: ");
		int customerId = sc.nextInt();
		sc.nextLine();
		System.out.print("enter customer name: ");
		String custName = sc.nextLine();
		System.out.print("enter customer email: ");
		String custEmail = sc.nextLine();
		System.out.print("enter balance: ");
		double balance = sc.nextDouble();
		System.out.print("enter minimum balance: ");
		double minimumBal = sc.nextDouble();
		
		System.out.println();
		System.out.print("enter amount to withdraw: ");
		double amount = sc.nextDouble();
		
		printDetails(accountNum, customerId, custName, custEmail, balance, minimumBal, amount);
		
		sc.close();

	}

	private static void printDetails(int accountNum, int customerId, String custName, String custEmail, double balance,
			double minimumBal, double amount) {
		Account ac = new SavingsAccount(accountNum, new Customer(customerId, custName, custEmail),balance, minimumBal);
		boolean response = ac.withDraw(amount);
		if(response) {
			System.out.printf("Rs %.2f debited | Balance: %.2f",amount,ac.getBalance());
		}
		
	}

}
