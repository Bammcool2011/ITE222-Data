package Quiz;

import java.util.Random;
import java.util.Scanner;

public class Unicorn {
	String name, lore_summary, color, hair_color, eye_color;
	double height, weight;
	int price;

	// --- Random Price Function ---
	Random rand = new Random();

	public int randomPrice() {
		return rand.nextInt((20 - 10) + 1) + 10; // Random price between 10 and 20
	}

	//  --- Constructor ---
	public Unicorn(String name, String lore_summary, String color, String hair_color, String eye_color, double height,
			double weight) {
		this.name = name; 
		this.lore_summary = lore_summary;
		this.color = color;
		this.hair_color = hair_color;
		this.eye_color = eye_color;
		this.height = height;
		this.weight = weight;

	}

	// --- Get Info Function ---
	public void getInfo() {
		System.out.println(" ");
		System.out.println("Name: " + name);
		System.out.println("Lore Summary: " + lore_summary);
		System.out.println("Color: " + color);
		System.out.println("Hair Color: " + hair_color);
		System.out.println("Eye Color: " + eye_color);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
		System.out.println("Price: " + randomPrice() + " USD");
	}

	// --- Main Function ---
	public static void main(String[] args) {
		
		// --- Object Creation (6 types of pony) ---
		Unicorn ts = new Unicorn("Twilight Sparkle", "Princess of Friendship", "Purple", "Purple", "Purple", 8, 100.0);
		Unicorn aj = new Unicorn("Applejack", "Element of Honesty", "Orange", "Yellow", "Green", 7, 90.0);
		Unicorn fs = new Unicorn("Fluttershy", "Element of Kindness", "Yellow", "Pink", "Green", 6, 80.0);
		Unicorn rd = new Unicorn("Rainbow Dash", "Element of Loyalty", "Blue", "Rainbow", "Red", 7, 85.0);
		Unicorn pp = new Unicorn("Pinkie Pie", "Element of Laughter", "Pink", "Pink", "Blue", 6, 75.0);
		Unicorn r = new Unicorn("Rarity", "Element of Generosity", "White", "Purple", "Blue", 7, 95.0);

		System.out.println("==============================================");
		System.out.println("Welcome to the My Little Pony Toy!");
		System.out.println("1.Twilight Sparkle, 2.Applejack, 3.Fluttershy \n4.Rainbow Dash, 5.Pinkie Pie, 6.Rarity");
		System.out.println("==============================================");
		System.out.print("Choose a pony: "); 

		Scanner sc = new Scanner(System.in); 
		int pony = sc.nextInt(); // User Input

		// --- Switch Case ---
		switch (pony) {
		case 1:
			ts.getInfo();
			break;
		case 2:
			aj.getInfo();
			break;
		case 3:
			fs.getInfo();
			break;
		case 4:
			rd.getInfo();
			break;
		case 5:
			pp.getInfo();
			break;
		case 6:
			r.getInfo();
			break;
		default:
			System.out.println("Invalid choice!");
		}

		sc.close();

	}

}
