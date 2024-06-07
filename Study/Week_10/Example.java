package Study.Week_10;

public class Example {
	static boolean Initialized = false;

	public static void Initialize() {
		Initialized = true;
		System.out.println("Initialized Complete");
		System.out.println("Ready to go!");
	}

	public static void main(String args[]) {
		// Call the static method Initialize directly

		Example.Initialize();

		// Create an object after initialization
		Example obj = new Example();
		System.out.println("Object Created");

		Example obj2 = new Example();
		System.out.println("Another Object Created");
	}

}
