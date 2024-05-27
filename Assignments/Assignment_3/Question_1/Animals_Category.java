package Assignments.Assignment_3.Question_1;

import java.util.Scanner;

public class Animals_Category {

	boolean herbivorous = false; // These are the boolean variables to check the diet of the animals.
	boolean carnivorous = false; // These are the boolean variables to check the diet of the animals.

	public void UserInput() {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the name of the animal: ");
		String name = console.next();

		herbivorous(name); // This method will check if the animal is herbivorous or not.

		console.close();
	}

	public void herbivorous(String name) {
		if (name.equalsIgnoreCase("cow") || (name.equalsIgnoreCase("deer"))) { 
										// equalsIgnoreCase is used to ignore the case of the input.
			System.out.println(name + " is herbivorous animal.");
			herbivorous = true;
			diet();
			appearance(name);
		}

		else { // If the animal is not herbivorous then it will check if the animal is
				// carnivorous or omnivorous.
			carnivorous(name); 
		}

	}

	public void carnivorous(String name) {
		if (name.equalsIgnoreCase("cat") || (name.equalsIgnoreCase("dolphin"))) {
			// equalsIgnoreCase is used to ignore the case of the input.
			System.out.println(name + " is carnivorous animal.");
			carnivorous = true;
			diet();
			appearance(name);
		} else {
			omnivorous(name); // If the animal is not carnivorous then 
							  // it will check if the animal is omnivorous.

		}
	}

	public void omnivorous(String name) {
		if (name.equalsIgnoreCase("Bear") || (name.equalsIgnoreCase("Fox"))) {
			System.out.println(name + " is omnivorous animal.");
			diet();
			appearance(name);
		} else {
			System.out.println("Invalid input. Please try again.");
			UserInput();
		}
	}

// These methods are used to display the diet and appearance of the animals (The main part are above to run the methods)

	public void diet() {
		if (herbivorous == true) {
			System.out.println("Diet of this animals - It eat plants.");
		} else if (carnivorous == true) {
			System.out.println("Diet of this animals - It eat meat.");
		} else {
			System.out.println("Diet of this animals - It eat both plants and meat.");
		}

	}

	public void appearance(String name) {

		// Herbivorous animals

		if (name.equalsIgnoreCase("cow")) {
			System.out.println(
					"The appearance of cow is white and black in color, with a hump on its back, and has horns and has a long tail.");
		} else if (name.equalsIgnoreCase("deer")) {
			System.out.println(
					"The appearance of deer is brown in color, with white spots on its body, and has antlers and has a short tail.");
		}

		// Carnivorous animals

		else if (name.equalsIgnoreCase("cat")) {
			System.out.println(
					"The appearance of cat is white, black, or brown in color, with a long tail, and has whiskers and has sharp claws.");
		} else if (name.equalsIgnoreCase("dolphin")) {
			System.out.println(
					"The appearance of dolphin is grey in color, with a long nose, and has fins and has a tail.");
		}

		// Omnivorous animals

		else if (name.equalsIgnoreCase("Bear")) {
			System.out.println(
					"The appearance of bear is black, brown, or white in color, with a hump on its back, and has claws and has a short tail.");
		} else if (name.equalsIgnoreCase("Fox")) {
			System.out.println(
					"The appearance of fox is red in color, with a long tail, and has whiskers and has sharp teeth.");
		}

	}
}
