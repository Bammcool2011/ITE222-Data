package Study.Week_10;

public class Prisoner {
	static int prinsonerCount = 0; // static variable
	int bookingNumber; // instance variable

	public Prisoner() { // constructor to increment the prisoner count
		prinsonerCount++;
		this.bookingNumber = prinsonerCount; // assign the booking number with the prisoner count
	}

	public void display() { // method to display
		System.out.println("Booking number: " + bookingNumber);
		System.out.println("Prisoner count: " + prinsonerCount);

	}

	public static void main(String args[]) {
		Prisoner p1 = new Prisoner();
		Prisoner p2 = new Prisoner();
		Prisoner p3 = new Prisoner();

		// -- display the prisoner details -- //
		System.out.println("Prisoner 1:");
		p1.display();
		System.out.println();

		System.out.println("Prisoner 2:");
		p2.display();
		System.out.println();

		System.out.println("Prisoner 3:");
		p3.display();
		System.out.println();
	}

}
