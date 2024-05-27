package Assignments.Assignment_5;

public class ITE222Section {
	int sectionNumber;
	String instructorName;
	String schedule;
	
	// -- Constructors default --
	ITE222Section() {
		this.sectionNumber = 0;
		this.instructorName = "TBA";
		this.schedule = "TBA";
	}
	
	// -- Constructors with parameters --
	ITE222Section(int sectionNumber){
		this.sectionNumber = sectionNumber;
		this.instructorName = "TBA";
		this.schedule = "TBA";
	}
	
	// -- Constructors with 2 parameters --
	ITE222Section(int sectionNumber, String instructorName){
		this.sectionNumber = sectionNumber;
		this.instructorName = instructorName;
		this.schedule = "TBA";
	}
	
	// -- Constructors with 3 parameters --
	ITE222Section(int sectionNumber, String instructorName, String schedule){
		this.sectionNumber = sectionNumber;
		this.instructorName = instructorName;
		this.schedule = schedule;
	}
	
	// -- Display method --
	public void displayDetails() {
		System.out.println("\nSection Number: " + this.sectionNumber);
		System.out.println("Instructor Name: " + this.instructorName);
		System.out.println("Schedule: " + this.schedule);
	}
	
    public static void main(String[] args) {
        ITE222Section section1 = new ITE222Section();
        ITE222Section section2 = new ITE222Section(1);
        ITE222Section section3 = new ITE222Section(2, "Dr. John");
        ITE222Section section4 = new ITE222Section(3, "Dr. John", "Monday/Thursday 8:30-10:30 AM");

        section1.displayDetails();
        section2.displayDetails();
        section3.displayDetails();
        section4.displayDetails();
    }
}
