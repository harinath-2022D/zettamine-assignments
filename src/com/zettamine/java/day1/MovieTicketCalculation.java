package com.zettamine.java.day1;

import java.util.Scanner;

public class MovieTicketCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of tickets: ");
		int noOfTickets = sc.nextInt();
		
		try {
			if(isValidNoOfTickets(noOfTickets)) {
				System.out.print("Do you want refreshment: ");
				String refreshment = sc.next();
				System.out.print("Do you have coupon code: ");
				String coupon = sc.next();
				System.out.print("Enter the Circle: ");
				String circle = sc.next();
				if(isValidCircle(circle)) {
					calculateTicketPrice(noOfTickets, refreshment, coupon, circle);
				}else {
					System.err.print("Invalid input");
					System.exit(1);
				}
				
			}
		} catch (InvalidInput e) {
			e.printStackTrace();
		
		}
		
		sc.close();

	}

	


	private static boolean isValidNoOfTickets(int noOfTickets) throws InvalidInput {
		
		if(noOfTickets < 5 || noOfTickets > 40) {
			throw new InvalidInput("Minimum of 5 and Maximum of 40 Tickets");
		}
		
		return true;
	}
	private static boolean isValidCircle(String circle) {
		if(circle.equals("K") || circle.equals("Q") || circle.equals("k") || circle.equals("q")) {
			return true;
		}
		return false;
	}
	
	private static void calculateTicketPrice(int noOfTickets, String refreshment, String coupon, String circle) {
		int baseTicketPrice = (circle.equals("K") || circle.equals("k")) ? 75 : 150;
		float totalCost = (float)baseTicketPrice * noOfTickets;
		
		if(noOfTickets > 20) {
			 float discount =(float) (totalCost * 0.10);
			 System.out.println("Ticket Discount is :" + discount);
			 totalCost -= discount;
		}
		
		if(coupon.equals("Y") || coupon.equals("y")) {
			float couponDiscount = (float) (totalCost * 0.02);
			System.out.println("Counpon discount is :" + couponDiscount);
			totalCost -= couponDiscount;
		}
		if(refreshment.equals("Y") || refreshment.equals("y")) {
			totalCost += 50 * noOfTickets;
		}
		System.out.println();
		System.out.printf("Tickets cost: %.2f", totalCost);
		
		
		
	}

}
