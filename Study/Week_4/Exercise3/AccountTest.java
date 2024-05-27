package Study.Week_4.Exercise3;

public class AccountTest {
	public static void main(String[] args) {
		CheckingAccount CA01 = new CheckingAccount(); // Create new object account (CA01) from SavingsAccount
		CA01.name = "Puin";
		CA01.balance = (1000);

		System.out.println("Account Details"); // Displaying account details
		System.out.println("Name: " + CA01.getName()); // Displaying name
		System.out.println("Balance: " + CA01.getBalance()); // Displaying balance

		// Withdrawal amount (all possible cases)
//		sa0001.Withdraw(-5);
		CA01.Withdraw(100);
//		sa0001.Withdraw(5000);

		System.out.println("Your current balance is: " + CA01.getBalance());

	} // End of main method

}
