package Study.Week_4;

public class SavingsAccount {
	public String name;
	public double balance;
	
	public void deposit(int x) { 
		balance += x;
	} // End of deposit method
	
	public double getBalance() { // To return name in main method
		return balance;
	}
	
	public String getName() { // To return name in main method
		return name;
	}
} // End of class
