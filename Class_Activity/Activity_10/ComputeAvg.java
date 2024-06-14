package Class_Activity.Activity_10;

import java.util.Scanner;

public class ComputeAvg {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your test scores (5 numbers): ");

		double[] scores = new double[5]; // Array to store the test scores

		for (int i = 0; i < scores.length; i++) { // Loop to get the test scores
			scores[i] = scanner.nextDouble(); // Get the test score
		}

		double average = 0; // Assign 0 fisrt because we are going to add all the test scores
		for (double score : scores) {
			average = average + score; // Sum of all the test scores
		}

		average = average / scores.length; // Average of the test scores

		System.out.println("The average of your test scores is: " + average);
		scanner.close();
	}
}
