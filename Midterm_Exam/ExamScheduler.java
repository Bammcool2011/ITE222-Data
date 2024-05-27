package Midterm_Exam;

import java.util.Scanner;

public class ExamScheduler {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		// --- CLASS OBJECTS --- //
		Schedulers scheduler = new Schedulers(); // Create an object of Schedulers class
		UserInput input = new UserInput(); // Create an object of UserInput class
		// -------------------- //

		input.StudentInfo(); // Call the StudentInfo method | Use for input some of student information
		String course; // a variable to store the course name

		do { // do-while loop to check the course name and display the exam schedule
			System.out.println("Enter the course name to check the exam schedule (or 'exit' to quit)");
			System.out.println("Programming, Operating_Systems, Project_Management and Artifical__Intelligence");
			course = console.nextLine();

			if (course.equalsIgnoreCase("Programming")) { // check if the course is Programming
				scheduler.setScheduler("Programming", "May 8", "4:30PM", "Room 2202"); // set the exam schedule
				scheduler.getDetails(); // get the exam schedule details
				System.out.println("\nWould you like to check any other following course?");

			} else if (course.equalsIgnoreCase("Operating_Systems")) { // check if the course is Operating Systems
				scheduler.setScheduler("Operating Systems", "May 15", "1:00PM", "Room 2206");
				scheduler.getDetails();
				System.out.println("\nWould you like to check any other following course?");

			} else if (course.equalsIgnoreCase("Project_Management")) { // check if the course is Project Management
				scheduler.setScheduler("Project Management", "May 20", "2:30PM", "Room 2204");
				scheduler.getDetails();
				System.out.println("\nWould you like to check any other following course?");

			} else if (course.equalsIgnoreCase("Artifical_Intelligence")) { // check if the course is Artificial Intelligence
				scheduler.setScheduler("Artifical Intelligence", "May 14", "12:30PM", "Room 2202");
				scheduler.getDetails();
				System.out.println("\nWould you like to check any other following course?");

			} else if (!course.equals("exit")) { // if the course is not found | and avoid when user enters 'exit' the programm shows the message D:
				System.out.println("Course not found | Invalid Input");
				System.out.println("Please try again");
			}
			
		} while (!course.equals("exit")); // exit the loop if the user enters 'exit'

		console.close();
		System.out.println("Thank you for using the Exam Scheduler");
	}

}
