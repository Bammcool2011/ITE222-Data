package Study.Week_11;

import java.util.Scanner;

public class StudentScores {
	public static void main(String args[]) {
		double scores[] = new double[10];
		double sum = 0.0, avg = 0.0;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the scores of 10 students: ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = keyboard.nextDouble();
		}

		System.out.println("Display the scores of 10 students");
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
			avg = sum / scores.length;
		}

		System.out.println("The average score of 10 students is: " + avg);

		keyboard.close();
	}
}
