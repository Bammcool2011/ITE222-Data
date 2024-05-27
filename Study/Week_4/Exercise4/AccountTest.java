package Study.Week_4.Exercise4;

// import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		CheckingAccount CA01 = new CheckingAccount(); // Create new object account (CA01) from SavingsAccount
		CA01.name = "Pumin";
		CA01.balance = (100);

		System.out.println("Account Details"); // Displaying account details
		System.out.println("Name: " + CA01.getName()); // Displaying name
		System.out.println("Balance: " + CA01.getBalance()); // Displaying balance

		// -------------(Exercise 2)------------ //

//		Scanner input = new Scanner(System.in); // Create a Scanner object
//
//		System.out.print("Please enter the amount you want to withdraw: ");
//		double withdrawAmount = input.nextDouble(); // Read user input
//		CA01.Withdraw(withdrawAmount); // Bring user input to Withdraw method in CheckingAccount class
//
//		input.close(); // Close the scanner
//
//		System.out.println("Your current balance is: " + CA01.getBalance()); 

		// ----------------------------------- //

		SavingBond sb = new SavingBond();

		sb.balance = CA01.getBalance(); // Bring the balance from CheckingAccount to SavingBond
		sb.term = 6; // amount of months
		sb.SavingBond_calc();

		for (int i = 0; i <= sb.term; i++) { // Loop to calculate interest
			sb.Interest_calc();
		}

	} // End of main method

}




