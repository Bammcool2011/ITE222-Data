package Study.Week_4.Exercise3;

public class CheckingAccount {

	double balance;
	String name;

	public void setBalance(double balance) { // This keyword assigns value to variable
		this.balance = balance;
	}

	public void setName(String name) { // This keyword assign name to variable
		this.name = name;
	}

	public String getName() { // To return name in main method
		return name;
	}

	public double getBalance() { // To return name in main method
		return balance;
	}

	public void Withdraw(double amount) { // Withdrawal method
		if (amount < 0) {
			System.out.println("\nWarning: Withdrawal amount is not accepted negative value");
		} 
		else if (amount > balance) {
			System.out.println("\nWarning: You have insufficient funds to withdraw");
		}
		else {
			System.out.println("\nAccepted: You successfully to withdraw");
			balance -= amount; // balance = balance - amount;
		}
	}
} // End of class
