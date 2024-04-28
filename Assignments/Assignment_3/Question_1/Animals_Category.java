package Assignments.Assignment_3;

public class Animals_Category {

	String type;
	
	boolean herbivorous = false;
	boolean carnivorous = false;

	public void herbivorous(String name) {
		if (name.equalsIgnoreCase("cow") || (name.equalsIgnoreCase("deer"))) {
			System.out.println(name + " is herbivorous animal.");
			herbivorous = true;
			diet();
			appearance(name);
		}

		else {
			carnivorous(name);
		}

	}

	public void carnivorous(String name) {
		if (name.equalsIgnoreCase("cat") || (name.equalsIgnoreCase("dolphin"))) {
			System.out.println(name + " is carnivorous animal.");
			carnivorous = true;
			diet();
			appearance(name);
		} else {
			System.out.println("Invalid input. Please try again.");
		}
	}

	public void omnivorous() {

	}

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

	}
}
