package Study.Practice;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input, total = 0;
		do {
			System.out.print("Enter first integer (enter 0 to quit): ");
			input = sc.nextInt();
			total += input;
		} while (input != 0);

		System.out.println("Total is: " + total);

		sc.close();
	}
}
