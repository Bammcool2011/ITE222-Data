package Assignments.Assignment_3.Question_3;

public class RegisterInfoGPA {
	String name, major, campus, year;
	int ID;
	double subject_points, credits, GPA;

	double point1, point2, point3, point4;
	int credit1, credit2, credit3, credit4;

	public void setStudentInfo(String name, String major, String campus, int ID, String year) { 
		// call student information and set it to the object
		this.name = name;
		this.major = major;
		this.campus = campus;
		this.ID = ID;
		this.year = year;
	}

	public void setPointsAndCredits(double point1, int credit1, double point2, int credit2, double point3, int credit3,
			double point4, int credit4) { // call points and credits and set it to the object
		this.subject_points = point1 + point2 + point3 + point4;
		this.credits = credit1 + credit2 + credit3 + credit4;
	}

	public void calculateGPA() { // calculate GPA
		double GPACal = subject_points / credits;
		GPA = GPACal;
	}

	public void print() {

		calculateGPA();

		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("| %-17s | %-10s | %-5s | %-8s | %-12s | %-4s |\n", "Student Name", "Student ID", "Major",
				"Campus", "Year", "GPA");
		System.out.println("|-------------------------------------------------------------------------|");
		System.out.printf("| %-17s | %-10s | %-5s | %-8s | %-12s | %.2f |\n", name, ID, major, campus, year, GPA);
		System.out.println("---------------------------------------------------------------------------");

	}

}
