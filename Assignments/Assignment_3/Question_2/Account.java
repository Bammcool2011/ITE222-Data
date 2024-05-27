package Assignments.Assignment_3.Question_2;

import java.util.Scanner;

public class Account {
	double balance;

	Scanner console = new Scanner(System.in);

	public void setBalance(double balance) { 
		this.balance = balance; // Set the balance

	}

	public double getBalance() {
		return balance; // Get the balance
	}

	// Deposit amount to account
	
	public void Deposit() {
		System.out.print("\nPlease enter the amount you want to deposit: ");
		double deposit = console.nextDouble();

		balance += deposit;
		System.out.println("New balance: " + balance);

		BasicAccount.menu(this); // Call the menu method
	}

	// Withdraw amount from account
	
	public void Withdraw() {
		System.out.println("\nYou can withdraw not overdraft more than $5000 or less than $100.");
		System.out.print("Please enter the amount you want to withdraw: ");

		double withdraw = console.nextDouble();

		// Check if the withdraw is between $100 and $5000 and update the balance
		if (withdraw >= 100 && withdraw <= 5000) {
			balance -= withdraw;
			System.out.println("New balance: " + balance);
			BasicAccount.menu(this); // Call the menu method

		// overdraft more than $5000 or less than $100 send back to the menu
		} else { 
			System.out.println("You cannot withdraw less than $100 or more than $5000. Please try again.");
			System.out.println("Your currently: " + balance);
			BasicAccount.menu(this); // Call the menu method

		}

	}
}
