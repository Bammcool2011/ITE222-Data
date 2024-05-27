package Study.Week_4.Execise2;

public class CheckingAccount {

	double balance;
	String name;
	
	public void setBalance(double balance) { // This keyword assigns value to variable
		this.balance=balance;
	}
	
	public void setName (String name) { // This keyword assign name to variable
		this.name=name;
	}
	
	public String getName() { // To return name in main method 
		return name;
	}
	
	public double getBalance() { // To return name in main method
		return balance;
	}

}
