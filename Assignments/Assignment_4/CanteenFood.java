package Assignments.Assignment_4;

public class CanteenFood {

	// -- Fields -- //
	String mondayMenu;
	String tuesdayMenu;
	String wednesdayMenu;
	String thursdayMenu;
	String fridayMenu;
	String saturdayMenu;
	String sundayMenu;

	// -- Constructor -- //
	CanteenFood(String mondayMenu, String tuesdayMenu, String wednesdayMenu, String thursdayMenu, String fridayMenu,
			String saturdayMenu, String sundayMenu) {
		this.mondayMenu = mondayMenu;
		this.tuesdayMenu = tuesdayMenu;
		this.wednesdayMenu = wednesdayMenu;
		this.thursdayMenu = thursdayMenu;
		this.fridayMenu = fridayMenu;
		this.saturdayMenu = saturdayMenu;
		this.sundayMenu = sundayMenu;
	}

	// -- Methods that use the switch statement to print the menu based on the day -- //
	public void printMenu(String day) {
		switch (day) {
		case "monday":
			System.out.println("-----------------------------------");
			System.out.println("Monday Menu: ");
			System.out.println(mondayMenu);
			break;
		case "tuesday":
			System.out.println("-----------------------------------");
			System.out.println("Tuesday Menu: ");
			System.out.println(tuesdayMenu);
			break;
		case "wednesday":
			System.out.println("-----------------------------------");
			System.out.println("Wednesday Menu: ");
			System.out.println(wednesdayMenu);
			break;
		case "thursday":
			System.out.println("-----------------------------------");
			System.out.println("Thursday Menu: ");
			System.out.println(thursdayMenu);
			break;
		case "friday":
			System.out.println("-----------------------------------");
			System.out.println("Friday Menu: ");
			System.out.println(fridayMenu);
			break;
		case "saturday":
			System.out.println("-----------------------------------");
			System.out.println("Saturday Menu: ");
			System.out.println(saturdayMenu);
			break;
		case "sunday":
			System.out.println("-----------------------------------");
			System.out.println("Sunday Menu: ");
			System.out.println(sundayMenu);
			System.out.println("-----------------------------------");
			break;
		}
	}

	// -- Main method -- //
	public static void main(String[] args) {
		CanteenFood canteen = new CanteenFood("Braised pork leg on rice", "Omelette on rice",
				"Fried rice with shrimp paste", "Thai chicken biryani", "Chicken rice", "Crispy pork on rice",
				"Red roast duck on rice");
		canteen.printMenu("monday");
		canteen.printMenu("tuesday");
		canteen.printMenu("wednesday");
		canteen.printMenu("thursday");
		canteen.printMenu("friday");
		canteen.printMenu("saturday");
		canteen.printMenu("sunday");

	}

}
