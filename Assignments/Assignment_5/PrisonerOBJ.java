package Assignments.Assignment_5;

public class PrisonerOBJ {
	// -- Data Fields -- //
	String name;
	double height;
	int sentence;
	
	// -- Constructors(Default) -- //
	PrisonerOBJ() {
		this.name = "Default Name";
		this.height = 1.75;
		this.sentence = 1;
	}
	
	// -- Constructors(Parameterized) -- //
	PrisonerOBJ(String name, double height, int sentence) {
		this.name = name;
		this.height = height;
		this.sentence = sentence;
	}

	// -- Methods to display details -- //
	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Height: " + this.height + " cm");
		System.out.println("Sentence: " + this.sentence + " years");
	}
	
	// -- Method to display details if callThink is true -- //
	public void display(boolean callThink) {
		display();
		if (callThink) {
			think();
		}
	}
	
	// -- Method to display a sentence when callThink is true -- //
	public void think() {
		System.out.println("I'll have my revenge.");
	}
	
	// -- Method to reset to default values -- //
	public void reset() {
		this.name = "Default Name";
		this.height = 1.75;
		this.sentence = 1;
	}

	public static void main(String[] args) {
		PrisonerOBJ prisoner1 = new PrisonerOBJ("John Doe", 1.85, 5);
		
		System.out.println("Initial Details:");
		prisoner1.display();
		
		System.out.println("\nUpdated Details (with think):");
		prisoner1.name = "Jane Doe";
		prisoner1.height = 1.65;
		prisoner1.sentence = 3;
		prisoner1.display(true);
		
		System.out.println("\nResetting to default values...");
		prisoner1.reset();
		prisoner1.display();


	}

}
