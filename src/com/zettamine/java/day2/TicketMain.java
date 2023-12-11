package com.zettamine.java.day2;

import java.util.Scanner;

public class TicketMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of bookings: ");
		int noOfBookings = sc.nextInt();
		
		System.out.print("Enter the availble Tickets: ");
		int availableTickets = sc.nextInt();
		Ticket ticket = new Ticket(availableTickets);
		while(noOfBookings > 0) {
			System.out.println();
			System.out.print("Enter the ticketID: ");
			int ticketID = sc.nextInt();
			System.out.print("Enter the price: ");
			int price = sc.nextInt();
			System.out.print("Enter the no of tickets: ");
			int noOfTickets = sc.nextInt();
			
			displayOutput(ticketID, price, noOfTickets);
		}

	}

	private static void displayOutput(int ticketID, int price, int noOfTickets) {
		System.out.println();
		Ticket ticket = new Ticket(ticketID, price);
		System.out.println("Available Tickets: " + ticket.getAvailbleTickets());
		System.out.println("Total Amount: " + ticket.calculateTicketsCost(noOfTickets));
		System.out.println("AvailbleTickets after booking: " + ticket.getAvailbleTickets());
		
		
	}

}
