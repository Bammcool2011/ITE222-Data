package Study.Week_7.Practice;

import java.util.Scanner;

public class Book {

	// -- Declare instance variables -- //

	String Title, Author;
	int YearPublished;

	// -- Method to set the title of the book -- //
	public void setTitle(String t) {
		this.Title = t;
	}

	// -- Method to set the author of the book -- //
	public void setAuthor(String a) {
		this.Author = a;
	}

	// -- Method to set the year the book was published -- //
	public void setYear(int y) {
		this.YearPublished = y;
	}

	// -- Method to display the book details -- //
	public void displayBooks() {
		System.out.println("\nTitle: " + Title);
		System.out.println("Author: " + Author);
		System.out.println("Year Published: " + YearPublished);
	}

	public static void main(String[] args) {

		// -- Create an instance of the Book class -- //

		Book book1 = new Book();
		Book book2 = new Book();

		Scanner console = new Scanner(System.in);

		// -- Enter Book 1 details -- //

		System.out.println("Enter details for Book 1:");
		System.out.print("Title: ");
		book1.setTitle(console.nextLine());

		System.out.print("Author: ");
		book1.setAuthor(console.nextLine());

		System.out.print("Year Published: ");
		book1.setYear(console.nextInt());

		// -- Enter Book 2 details -- //
		console.nextLine();

		System.out.println("\nEnter details for Book 2:");
		System.out.print("Title: ");
		book2.setTitle(console.nextLine());

		System.out.print("Author: ");
		book2.setAuthor(console.nextLine());

		System.out.print("Year Published: ");
		book2.setYear(console.nextInt());

		// -- Display Book details -- //
		book1.displayBooks();
		book2.displayBooks();

		console.close();
	}

}
