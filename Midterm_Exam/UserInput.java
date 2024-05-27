package Midterm_Exam;

import java.util.Scanner;

public class UserInput {
	Scanner input = new Scanner(System.in);

	String student; // a variable to store the student name
	int enrollment; // a variable to store the student enrollment number
	String major; // a variable to store the student major name

	public void StudentInfo() {

		System.out.print("Enter Students name: ");
		student = input.nextLine();

		System.out.print("Enter Student enrollment number: ");
		enrollment = input.nextInt();

		System.out.print("Enter Student Major name: ");
		major = input.next();

	}
}
