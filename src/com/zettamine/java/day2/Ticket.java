package com.zettamine.java.day2;

public class Ticket {
	private int ticketid;
	private int ticketPrice;
	private static int availbleTickets;
	
	public Ticket(int availbleTickets) {
		this.availbleTickets = availbleTickets;
	}
	
	public Ticket() {
	}

	public Ticket(int ticketID2, int price) {
		this.ticketid = ticketID2;
		this.ticketPrice = price;
	}

	public int calculateTicketsCost(int noOfTickets) {
		if(noOfTickets > availbleTickets) {
			return -1;
		}
		setAvailbleTickets(availbleTickets - noOfTickets);
		return ticketPrice * noOfTickets;
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public static int getAvailbleTickets() {
		return availbleTickets;
	}

	public static void setAvailbleTickets(int availbleTickets) {
		Ticket.availbleTickets = availbleTickets;
	}
	
}
