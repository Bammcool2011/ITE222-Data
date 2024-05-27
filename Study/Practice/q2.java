package Study.Practice;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Tets Data:");
		System.out.print("Input the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Input the second number: ");
		int num2 = sc.nextInt();
		System.out.print("Input the third number: ");
		int num3 = sc.nextInt();

		System.out.println("The smallest value is " + Math.min(num1, Math.min(num2, num3)));

		sc.close();
	}

}
