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

	public void setCreditBalance(int creditBalance) {
		this.creditBalance = creditBalance;
	}

	public void setTicketBalance(int ticketBalance) {
		this.ticketBalance = ticketBalance;
	}

	public void playGame(int creditCost, int ticketCost) {
		if (creditCost >= 0 && ticketCost >= 0) {
			this.creditBalance -= creditCost;
			this.ticketBalance += ticketCost;
		} else {
			System.out.println("Invalid amount of credits or tickets");
		}
	}

}

public class Arcade {

	public static void main(String[] args) {

	}

}
