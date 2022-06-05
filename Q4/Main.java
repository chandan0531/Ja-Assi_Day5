package com.Q4;

public class Main {
	
	public static void main(String[] args) {
		
		Ticket t = new Ticket();
		
		Ticket.setAvailableTickets(20);
		System.out.println("Available tickets : " + Ticket.getAvailableTickets());
		
		t.setPrice(100);
		t.setTicketid(123);
		
		int total = t.calculateTicketCost(2);
		
		System.out.println( "Total Amount : " + total);
		System.out.println("Enter the ticketid : " + t.getTicketid());
		System.out.println("Available ticket after booking : " + Ticket.getAvailableTickets());
		
	}
}
