package Assignments.Assignment_3.Question_2;

import java.util.Scanner;

public class BasicAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account DS = new Account(); // Create a DS object of Account class

		String name = "Pumin";
		DS.balance = 500;

		System.out.println("Welcome to the Bank");
		System.out.println("Name: " + name);
		System.out.println("Balance: " + DS.getBalance());

		menu(DS); // Call the menu method
	}

	public static void menu(Account DS) { // Withdraw amount from account

		Scanner console = new Scanner(System.in);

		System.out.println("\nPlease select an option:");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Exit");
		System.out.print("Enter your choice: ");

		int userChoice = console.nextInt();

		// If else case to select the choice
		
		if (userChoice == 1) { 
			DS.Withdraw();
		}
		else if (userChoice == 2) {
			DS.Deposit();
		} else if (userChoice == 3) {
			System.out.println("Thank you for using the Bank");
		} else {
			System.out.println("Invalid choice. Please try again.");
			menu(DS);
		}

		console.close();
	}
}