package Study.Week_8;

public class OverloadConstructors {
	String name;
	double height;
	int sentence;

	public OverloadConstructors(String name, double height, int sentence) {
		this.name = name;
		this.height = height;
		this.sentence = sentence;
	}

	public OverloadConstructors() {
//		this.name = name;
//		this.height = height;
//		this.sentence = sentence;
		this("Twitch", 6.5, 3);
	}

	public static void main(String[] args) {
		OverloadConstructors p1 = new OverloadConstructors("Bubba", 5.5, 3);
		System.out.println("Name: " + p1.name + ", Height: " + p1.height + ", Sentence: " + p1.sentence);
		OverloadConstructors p2 = new OverloadConstructors();
		System.out.println("Name: " + p2.name + ", Height: " + p2.height + ", Sentence: " + p2.sentence);
	}

}
