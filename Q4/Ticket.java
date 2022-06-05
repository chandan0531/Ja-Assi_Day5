package com.Q4;

public class Ticket {
	
	int ticketid;
	int price;
	static int availableTickets;
	
	
	public int calculateTicketCost(int nooftickets) {
		if(availableTickets>0)
		{
			availableTickets = availableTickets - nooftickets;
//			System.out.println(availableTickets);
			int total = nooftickets*price;
			return total;
		}
		return -1;
	}
	
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets>0)
		{	
			Ticket.availableTickets = availableTickets;
		}
	}
	
	

	
}
