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

	public void addCredits(int credits) {
		this.creditBalance += credits;
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

class Prize {
	private String name;
	private int ticketsRequired;
	private int count;

	Prize(String name, int ticketsRequired, int count) {
		this.name = name;
		this.ticketsRequired = ticketsRequired;
		this.count = count;
	}

	public boolean redeemPrize(Card card) {
		if (card.getTicketBalance() >= ticketsRequired && count > 0) {
			card.substactCredits(ticketsRequired);
			count--;

			System.out.println("Prize Redeemed: " + name);
			System.out.println("Remaining prizes: " + name + " Prizes: " + count);
			return true;
		} else {
			System.out.println("Insufficient tickets or prizes are out of stock");
			return false;
		}
	}
}

class Terminal {

	public void checkCardBalance(Card card) {
		System.out.println("Card Number: " + card.getCardNumber());
		System.out.println("Credit Balance: " + card.getCreditBalance());
		System.out.println("Ticket Balance: " + card.getTicketBalance());
	}

	public void addCreditsToCard(Card card, int creditsToAdd) {
		card.addCredits(creditsToAdd);
		System.out.println("Added " + creditsToAdd + " credits to the card" + card.getCardNumber());
	}

	public void playGameWithCard(Game game, Card card) {
		int ticketsWon = game.gameStart(card);
		System.out.println("Tickets won by Card " + card.getCardNumber() + ": " + ticketsWon);
	}
}

public class Arcade {
	public static void main(String[] args) {
		System.out.println("===========================");
		System.out.println("Welcome to Card Arcade game");
		System.out.println("===========================");

		Card c01 = new Card(1, 10, 0);
		Card c02 = new Card(2, 20, 0);

		Game game = new Game(5);
		Prize[] prizes = { new Prize("Candy", 5, 10), new Prize("Toy", 8, 7), new Prize("Book", 15, 3) };

		Terminal terminal = new Terminal();

		terminal.checkCardBalance(c01);
		terminal.addCreditsToCard(c01, 5);
		terminal.playGameWithCard(game, c01);
		terminal.checkCardBalance(c01);

		// Redeem a prize
		Prize prizeToRedeem = prizes[0]; // Redeem the first prize
		terminal.checkCardBalance(c01);
		prizeToRedeem.redeemPrize(c01);
		terminal.checkCardBalance(c01);

		terminal.checkCardBalance(c02);
		terminal.playGameWithCard(game, c02);
		terminal.checkCardBalance(c02);
	}
}
