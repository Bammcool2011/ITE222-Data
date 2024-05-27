package Study.Week_7.Practice;

import java.util.Scanner;

public class StudentInfo {

	String name;
	int id;
	String major;
	String courses;

	public void setName(String n) {
		this.name = n;
	}

	public void setId(int i) {
		this.id = i;
	}

	public void setMajor(String m) {
		this.major = m;
	}

	public void StudentDisplay() {
		System.out.println("\nStudent Details: ");
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Major: " + major);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentInfo student1 = new StudentInfo();

		System.out.println("Enter student details: ");
		System.out.print("Name: ");
		student1.setName(sc.nextLine());

		System.out.print("ID: ");
		student1.setId(sc.nextInt());

		sc.nextLine();

		System.out.print("Major: ");
		student1.setMajor(sc.nextLine());

		student1.StudentDisplay();

		sc.close();
	}
}
