package com.zettamine.java.day4;

import java.util.Scanner;

public class VehicleLoan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter vehicle number: ");
		String vehicleNum = sc.nextLine();
		
		System.out.print("enter model number: ");
		String modelNum = sc.nextLine();
		
		System.out.print("enter vehicle type ( 2 wheeler | 3 wheeler | 4 wheeler ): ");
		String vehicleType = sc.nextLine();
		
		System.out.print("enter price: ");
		double price = sc.nextDouble();
		sc.close();
		
		Vehicle obj = new Vehicle(vehicleNum, modelNum, vehicleType, price);
		
		System.out.printf("possible loan: %.2f\n" , obj.issueLoan());
		System.out.printf("amount to be paid for insurance is: %.2f", obj.takeInsurance());

	}

}
