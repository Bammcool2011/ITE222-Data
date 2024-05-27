package Study.Practice.Q4;

public class Student {
	String name;
	int ID;
	int age;
	String major;

	Student(String name, int ID, int age) {
		this.name = name;
		this.ID = ID;
		this.age = age;
		
	}

	Student(String major) {
	}

	public static void main(String args[]) {

		Student Info = new Student("Pumin", 2104270033, 21);
		Student Major = new Student("information technology");

		System.out.println("Name: " + Info.name);
		System.out.println("ID: " + Info.ID);
		System.out.println("Age: " + Info.age);
		System.out.println("Major: " + Major.major);
	}

}
