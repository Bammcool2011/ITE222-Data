package Study.Week_10;

public class Prisoner_3 {
	private static int prisonerCount = 0;
	int bookingNumber;

	public Prisoner_3() {
		prisonerCount++;
		this.bookingNumber = prisonerCount;
	}

	public static int getPrisonerCount() {
		return prisonerCount;
	}

	public static void display() {
//		System.out.println("Booking number: " + bookingNumber);
		System.out.println("Prisoner count: " + getPrisonerCount());

	}

	public static void main(String args[]) {
		Prisoner_3 p1 = new Prisoner_3();
		Prisoner_3 p2 = new Prisoner_3();
		Prisoner_3 p3 = new Prisoner_3();

		display();
	}
}
