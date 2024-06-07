package Study.Week_9;

public class PrisonTest {

	public static void main(String args[]) {
		// A1 = Cell name, doorOpen = false
		Cell c1 = new Cell("A1", false, 1234);
		Prisoner p1 = new Prisoner("Bubba", 2.08, 4, c1);
		
		p1.display();
		System.out.println("\nPut 1111");
		c1.securityCheck(1111);
		
		System.out.println("\nPut 12345");
		c1.securityCheck(12345);
		
		System.out.println("\nPut 1234 (Correct password)");
		c1.securityCheck(1234);
	}

}

