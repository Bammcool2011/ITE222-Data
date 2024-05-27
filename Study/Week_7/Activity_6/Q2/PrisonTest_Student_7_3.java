package Study.Week_7.Activity_6.Q2;

public class PrisonTest_Student_7_3 {

	public static void main(String[] args) {
		// Create two Prisoner objects
		Prisoner_Student_7_3 p01 = new Prisoner_Student_7_3(); 
		Prisoner_Student_7_3 p02 = new Prisoner_Student_7_3();
		// Set the fields of the objects
		p01.setFields("Bubba", 2.08, 4);
		p02.setFields("Twitch", 1.73, 3);
		
		System.out.println("-- Prisoner's information --");
		System.out.println("Name: " + p01.name);
		System.out.println("Height: " + p01.height + "m");
		System.out.println("Sentence: " + p01.sentence + " years");

		System.out.println("\n-- Prisoner's information --");
		System.out.println("Name: " + p02.name);
		System.out.println("Height: " + p02.height + "m");
		System.out.println("Sentence: " + p02.sentence + " years");

	}

}
