package Assignments.Assignment_3.Question_3;

public class PrintStudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegisterInfoGPA info = new RegisterInfoGPA(); // Create object

		info.setStudentInfo("Pumin Whungprasit", "IT", "Bangkok", 2104270033, "Third Years"); 
		// Set student info

		info.setPointsAndCredits(20, 4, 16, 4, 13, 4, 8, 4); // Set points and credits

		info.print(); // Print student info

	}

}
