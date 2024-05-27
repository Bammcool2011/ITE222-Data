package Study.Week_4.Exercise4;

import java.text.DecimalFormat;

public class SavingBond { // Class name

	String name;
	double balance, interest_rate;
	int months_remaining, term;

	public void SavingBond_calc() { // Method to calculate interest rate
		if (term <= 11 && term >= 0) {
			interest_rate = 0.005;
		} else if (term >= 12 && term <= 23) {
			interest_rate = 0.01;
		} else if (term >= 24 && term <= 35) {
			interest_rate = 0.015;
		} else if (term >= 36 && term <= 47) {
			interest_rate = 0.02;
		} else if (term >= 48 && term <= 60) {
			interest_rate = 0.025;
		} else {
			System.out.println("Invalid term");
		}
		months_remaining = term; // Assign the term to months_remaining
	}

	public void Interest_calc() { // Method to calculate interest

		if (months_remaining > 0) {
			balance += balance * interest_rate / 12; // Calculate the interest
			months_remaining--; // Decrease the months_remaining by 1

			DecimalFormat df = new DecimalFormat("#.###");

			System.out.println("\nCalculating interest...");
			System.out.println("Balance: $" + df.format(balance));
			System.out.println("Rate: " + interest_rate);
			System.out.println("Months remaining: " + months_remaining);

		} else {
			System.out.println("Bond Matured and no months remaining");
		}
	}

}
