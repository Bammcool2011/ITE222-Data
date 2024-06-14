package Study.Week_11;

import java.util.Scanner;

public class StudentScores {
	public static void main(String args[]) {
		double scores[] = new double[10]; // Declare an array of double type
		double sum = 0.0, avg = 0.0; // Declare two double type variables
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the scores of 10 students: "); // Prompt the user to enter the scores of 10 students
		for (int i = 0; i < scores.length; i++) { // For loop to traverse the array
			scores[i] = keyboard.nextDouble(); // Read the input from the user to store in the array
		}

		System.out.println("Display the scores of 10 students");
		for (int i = 0; i < scores.length; i++) { // For loop to traverse the array to display the scores
			System.out.println(scores[i]); // Print the scores of 10 students
		}

		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i]; // Calculate the sum of the scores
			avg = sum / scores.length;
		}

		System.out.println("The average score of 10 students is: " + avg);

		keyboard.close();
	}
}
