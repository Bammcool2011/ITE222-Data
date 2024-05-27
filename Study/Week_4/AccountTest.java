package Study.Week_4;

public class AccountTest {
	public static void main (String[] args) {
		SavingsAccount sa0001 = new SavingsAccount(); // Create new object account (sa0001) from SavingsAccount 
		sa0001.name = "Damian";
		sa0001.balance = (1000);
		
		System.out.println("Name: " + sa0001.getName()); // Displaying name
		System.out.println("Balance: " + sa0001.getBalance()); // Displaying balance
		
		
	} // End of main method
}
