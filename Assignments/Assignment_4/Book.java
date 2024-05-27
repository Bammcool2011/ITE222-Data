
package Assignments.Assignment_4;

public class Book {
	// -- fields -- //
	String title;
	String author;
	int year;
	boolean isAvailable;

	// -- constructor -- //
	public Book(String title, String author, int year, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.isAvailable = isAvailable;
	}

	// -- methods borrowed the Book -- //
	public void borrowBook() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("The book " + title + " has been borrowed");
		} else {
			System.out.println("The book " + title + " is not available");
		}
	}

	// -- methods return the Book -- //
	public void returnBook() {
		isAvailable = true;
		System.out.println("The book " + title + " has been returned");
	}

	// -- methods display the messages -- //
	public void displayInfo() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Year: " + year);
		System.out.println("Is Available: " + isAvailable);
	}

	// -- main method to print the output -- //
	public static void main(String[] args) {
		Book b1 = new Book("Java Programming", "John", 2024, false);
		b1.displayInfo();
		b1.borrowBook();
		b1.returnBook();

	}
}
