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

	// -- Getter Methods -- //
	public int getCardNumber() {
		return cardNumber;
	}

	public int getCreditBalance() {
		return creditBalance;
	}

	public int getTicketBalance() {
		return ticketBalance;
	}

	// -- To set new values (Setter) -- //
	public void setCreditBalance(int creditBalance) {
		this.creditBalance = creditBalance;
	}

	public void setTicketBalance(int ticketBalance) {
		this.ticketBalance = ticketBalance;
	}

	// -- Substracting credits (for use when playing games) -- //
	public void subtractCredits(int credits) {
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

	// -- Method for checking if the game can be played -- //
	// -- when the credits and tickets are greater than 0 -- //
	public void playGame() {
		if (creditBalance >= 0 && ticketBalance >= 0) {
			System.out.println("Starting the game...");
		} else {
			System.out.println("Invalid amount of credits or tickets");
		}
	}

	// -- Method for transferring balance from one card to another -- //
	public void transferBalance(Card toCard) {
		toCard.addCredits(this.creditBalance);
		toCard.addTickets(this.ticketBalance);
		this.creditBalance = 0;
		this.ticketBalance = 0;
	}
}

// -- Game class for playing games -- //
class Game {
	private int creditRequired;

	// -- Constructor for get the required credits to play the game -- //
	Game(int creditRequired) {
		this.creditRequired = creditRequired;
	}

	public int gameStart(Card card) {
		if (card.getCreditBalance() >= creditRequired) {
			// -- Random number of tickets won -- //
			Random random = new Random();
			int ticketsWon = random.nextInt(10) + 1; // 1 to 10 tickets
			card.subtractCredits(creditRequired);
			card.addTickets(ticketsWon); // Adding the tickets when the game is won
			return ticketsWon;
		} else {
			System.out.println("Insufficient credits");
			return 0;
		}
	}
}

// -- Prize class for redeeming prizes -- //
class Prize {
	public static Object prize;
	private String name;
	private int ticketsRequired;

	Prize(String name, int ticketsRequired) {
		this.name = name;
		this.ticketsRequired = ticketsRequired;
	}

// -- Method for redeeming the prize -- //
	public boolean redeemPrize(Card card) { // Checking if the card has enough tickets and the prize is in stock
		// Use boolean because we need to check if the prize is redeemed or not

		// -- If the card has enough tickets -- //
		if (card.getTicketBalance() >= ticketsRequired) {
			card.setTicketBalance(card.getTicketBalance() - ticketsRequired);
			System.out.println("Prize Redeemed: " + name);
			return true;
		} else {
			System.out.println("Insufficient tickets or prizes are out of stock");
			return false;
		}
	}
}

// -- Terminal class for checking card balance, adding credits, playing games -- //
class Terminal {

	public void checkCardBalance(Card card) {
		System.out.println("Card Number: " + card.getCardNumber());
		System.out.println("Credit Balance: " + card.getCreditBalance());
		System.out.println("Ticket Balance: " + card.getTicketBalance());
	}

	public void addCreditsToCard(Card card, int creditsToAdd) {
		card.addCredits(creditsToAdd);
		System.out.println("Added " + creditsToAdd + " credits to the card " + card.getCardNumber());
	}

	// -- Method for playing games with the card -- //
	// -- so when the game is played, the tickets won are displayed (from `random` in Game class) -- //
	public void playGameWithCard(Game game, Card card) {
		int ticketsWon = game.gameStart(card);
		System.out.println(">> Tickets won by Card " + card.getCardNumber() + ": " + ticketsWon);
	}
}

public class Arcade {
	public static void main(String[] args) {
		System.out.println("===============================");
		System.out.println("  Welcome to Card Arcade game");
		System.out.println("===============================");

		Card c01 = new Card(1, 0, 0);
		Card c02 = new Card(2, 0, 0);

		Game game = new Game(10);
		// Prizes: Candy using 5 tickets, Toy using 10 tickets, Book using 30 tickets
		Prize[] prizes = { new Prize("Candy", 5), new Prize("Toy", 10), new Prize("Book", 30) };

		Terminal terminal = new Terminal();

		terminal.addCreditsToCard(c01, 10);
		terminal.addCreditsToCard(c02, 10);
		System.out.println("===============================");

		// After playing bunch of games
		System.out.println();
		for (int i = 0; i < 3; i++) {
			terminal.playGameWithCard(game, c01);
			terminal.playGameWithCard(game, c02);
		}
		System.out.println();
		System.out.println("===============================");

		c01.transferBalance(c02);

		System.out.println("\nTransferring balance from Card 1 to Card 2:");
		terminal.checkCardBalance(c01);
		terminal.checkCardBalance(c02);

		System.out.println("\n===============================");
		System.out.println("\nRedeeming prizes using Card 2:");
		for (Prize prize : prizes) {
			prize.redeemPrize(c02);
		}

		System.out.println("\n===============================");
		System.out.println("\nAttempting to play a game and redeem a prize using Card 1:");
		terminal.playGameWithCard(game, c01);
		for (Prize prize : prizes) {
			   prize.redeemPrize(c01);
			}

		// Additional tests
		System.out.println("\n===============================");
		System.out.println("\nChecking card balances: ");
		System.out.println();
		terminal.checkCardBalance(c01);
		System.out.println();
		terminal.checkCardBalance(c02);
		System.out.println("\n===============================");
	}
}
