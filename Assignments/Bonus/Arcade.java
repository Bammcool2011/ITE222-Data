package Assignments.Bonus;

import java.util.Random;

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

	public void setCreditBalance(int creditBalance) {
		this.creditBalance = creditBalance;
	}

	public void setTicketBalance(int ticketBalance) {
		this.ticketBalance = ticketBalance;
	}

	public void substactCredits(int credits) {
		if (this.creditBalance >= credits) {
			this.creditBalance -= credits;
		} else {
			System.out.println("Insufficient credits");
		}
	}

	public void addTickets(int tickets) {
		this.ticketBalance += tickets;
	}

	public void playGame() {
		if (creditBalance >= 0 && ticketBalance >= 0) {
			System.out.println("Starting the game...");
		} else {
			System.out.println("Invalid amount of credits or tickets");
		}
	}

}

class Game {
	private int creditRequired;

	Game(int creditRequired) {
		this.creditRequired = creditRequired;
	}

	public int gameStart(Card card) {
		if (card.getCreditBalance() >= creditRequired) {
			Random random = new Random();
			int ticketsWon = random.nextInt(10);
			card.substactCredits(creditRequired);
			card.addTickets(ticketsWon);
			return ticketsWon;

		} else {
			System.out.println("Insufficient credits");
			return 0;
		}
	}
}

public class Arcade {

	public static void main(String[] args) {
		System.out.println("Welcome to Card Arcade game");

		System.out.println("Players Details: ");
		Card c01 = new Card(1, 0, 0);
		Card c02 = new Card(2, 100, 0);

	}

}
