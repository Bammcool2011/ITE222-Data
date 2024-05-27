package Study.Week_4.Execise2;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount account=new CheckingAccount(); // Create new object account from CheckingAccount
		
		account.setBalance(1000); // Assigning value to balance balance in another class
		account.setName("Pumin"); // Assigning name to name variable in another class
		
		System.out.println("Account Details"); // Displaying account details
		System.out.println("Name: " + account.getName()); // Displaying name
		System.out.println("Balance: " + account.getBalance()); // Displaying balance
	}

}
