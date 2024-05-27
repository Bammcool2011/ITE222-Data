package Quiz;

public class Unicorn_1 {
	String name;

	public Unicorn_1(String n) {
		System.out.println("Unicorn Details:");
		name = n;
	}

	public static void main(String[] args) {
		Unicorn_1 u1 = new Unicorn_1("Twilight Sparkle");
		System.out.println("Name: " + u1.name);

	}

}
