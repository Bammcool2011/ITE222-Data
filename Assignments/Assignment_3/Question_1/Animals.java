package Assignments.Assignment_3;

import java.util.Scanner;

public class Animals {

	public static void main(String[] args) {

		Animals_Category animal = new Animals_Category();
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);

		System.out.println("Welcome to ANIMALS KINGDOM!");
		System.out.println("------------------------------");

		System.out.print("Enter the name of the animal: ");
		String name = console.next();
		 
		animal.herbivorous(name);
		
		console.close();
		
	}

}
