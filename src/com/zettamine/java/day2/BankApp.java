package com.zettamine.java.day2;

import java.util.Scanner;

public class BankApp {
	
	private static Scanner sc = new Scanner(System.in);
	private static Account account;
	private static String SUCCESS = "\u001B[32m";
	private static String RESET = "\u001B[0m";

	public static void main(String[] args) {
		
		enterOption();
	}

	private static void enterOption() {
		
		System.out.print("Enter an option: \n");
		System.out.print("1.Create Account \n2.Deposit \n3.Withdraw \n4.Detial \n5.ROI \n6.EXIT \n");
		int option = sc.nextInt();
		
		if(option == 1) {
			if(account != null) {
				System.out.print("You already have an account with us.....\n");
				enterOption();
			}
			System.out.print("Enter A/C number: ");
			long accountNo = sc.nextLong();
			System.out.print("Enter type of Account savings(S) or current(C): ");
			
			String type = sc.next();
			System.out.print("Enter name: ");
			sc.nextLine();
			String name = sc.nextLine();
			while(validName(name) == false) {
				System.out.print("please enter valid name: ");
				name = sc.nextLine();
			}
			System.out.print("Enter minimum balance: ");
			float balance = sc.nextFloat();
			createAccount(accountNo, name, balance, type);
		}else if(option == 2) {
			try {
			System.out.print("Enter amount to Deposit: ");
			float depositAmount = sc.nextFloat();
			if(!isValidAmount(depositAmount)) {
				System.err.print("---AMOUNT CANN'T BE NEGATIVE----\n");
				enterOption();
			}
			
			String response = account.deposit(depositAmount);
			System.out.print(response + "\n");
			enterOption();
			} catch(Exception e) {
					System.err.print("Please open A/C ... \n");
					enterOption();
			}
		}else if(option == 3) {
			try {
				float balance = account.getBalance();
				System.out.print("Enter withdraw amount: ");
				float withdrawAmount = sc.nextFloat();
				if(!isValidAmount(withdrawAmount)) {
					System.err.print("---AMOUNT CANN'T BE NEGATIVE----\n");
					enterOption();
				}
				if(withdrawAmount > balance) {
					System.err.print("Insuffucient Balance \n");
					enterOption();
				}
				
				String response = account.withdraw(withdrawAmount);
				System.out.print(response + "\n");
				float service = 0;
				if(((SavingsAccount) account).type().equals("SAVINGS")) {
					service = ((SavingsAccount) account).serviceCharge();
				}
				if(service > 0) {
					System.out.print(service +" Service charge debited");
				}
				enterOption();
			}catch(Exception e) {
				System.err.print("Please open A/C ... \n");
				enterOption();
			}
		}else if(option == 4) {
			try {
				System.out.print(account.getDetails());
			}catch(Exception e) {
				System.err.print("Please open A/C ... \n");
				enterOption();
			}
		}else if(option == 6) {
			System.out.print(SUCCESS + "--- BYE BYE ---" + RESET);
			System.exit(0);
		}else if(option == 5){
			if(account == null) {
				System.err.print("Please open A/C ... \n");
				enterOption();
			}
			if(((SavingsAccount) account).type().equals("SAVINGS")) {
				float roi =  ((SavingsAccount) account).calculateROI();
				System.out.print("ROI " + roi);
				account.deposit(roi);
				enterOption();
			}
		}else {
			System.err.print("Invalid option ... \n");
			enterOption();
		}
		
	}

	private static boolean isValidAmount(float amt) {
		return amt > 0.0 ;
		
	}

	private static void createAccount(long accountNo, String name, float balance, String type) {
		if(type.equals("S")) {
			 account = new SavingsAccount(accountNo, name, balance);
			 
			System.out.print(SUCCESS + "Savings Acconut opened... \n" + RESET);
			enterOption();
		}else if(type.equals("C")) {
			 account = new CurrentAccount(accountNo, name, balance);
			 
			 System.out.print(SUCCESS + "Current Acconut opened... \n" + RESET);
			enterOption();
		}else {
			System.err.print("---------PLEASE CHOOSE VALID ACCOUNT TYPE SAVINGS(S) OR CURRENT(C)------ \n");
			enterOption();
		}
		
	}
	
	private static boolean validName(String name) {
		name = name.trim();
		boolean result = name.matches("^[a-zA-Z\\s]+$");
		return result;
	}

}
