package Assignments.Bonus;

class Card {
	private int cardNumber;
	private int creditBalance;
	private int ticketBalance;

	public Card(int cardNumber, int creditBalance, int ticketBalance) {
		this.cardNumber = cardNumber;
		this.creditBalance = creditBalance;
		this.ticketBalance = ticketBalance;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public int getCreditBalance() {
		return creditBalance;
	}

	public int getTicketBalance() {
		return ticketBalance;
	}

	public void addTickets(int tickets) {
		if (tickets >= 0) {
			this.ticketBalance += tickets;
		} else {
			System.out.println("Invalid amount of tickets to add");
		}
	}

	public void exchangeTickets(int tickets) {
		if (tickets >= 0) {
			this.ticketBalance -= tickets;
			this.creditBalance += tickets;
		} else {
			System.out.println("Invalid amount of tickets to exchange");
		}
	}
}

public class Arcade {

	public static void main(String[] args) {

	}

}
