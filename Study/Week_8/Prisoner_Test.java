package Study.Week_8;

public class Prisoner_Test {

	// -- Fields -- //
	String name;
	double height;
	int senntence;

	// -- Constructor -- //
//	public Prisoner_Test(String name, double height, int senntence) {
//		this.name = name;
//		this.height = height;
//		this.senntence = senntence;
//	}

	// -- Method to print out a sentence -- //
	public void printFields() {
		System.out.println("Name: " + "Bubba");
		System.out.println("Height: " + 5.5);
		System.out.println("Sentence: " + 10);
	}

	// -- Call think method if isThinking is true -- //
	public void printFields(boolean isThinking) {
		if (isThinking) {
			think();
		}
	}

	// -- Think method to print out a message -- //
	public void think() {
		System.out.println("Prisoner is thinking...");
	}

	public static void main(String[] args) {
		Prisoner_Test p01 = new Prisoner_Test();

		p01.printFields();
		p01.printFields(true);
	}

}
