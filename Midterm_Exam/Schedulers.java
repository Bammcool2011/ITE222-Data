package Midterm_Exam;

public class Schedulers {
	String course;
	String date;
	String time;
	String room;

	public void setScheduler(String course, String date, String time, String room) { // method to set the exam schedule
		this.course = course; // set the course name to the exam schedule
		this.date = date; // set the exam date to the exam schedule
		this.time = time; // set the exam time to the exam schedule
		this.room = room; // set the exam room to the exam schedule
	}

	public void getDetails() { // method to get the exam schedule details
		System.out.println("\n======================================================================");
		System.out.println(course + " Exam: Date: " + date + ", Time: " + time + ", Room: " + room);
		System.out.println("======================================================================");
	}
}
