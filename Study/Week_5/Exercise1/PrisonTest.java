package Study.Week_5.Exercise1;

public class PrisonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercise 1

//		Prisoner Bubba = new Prisoner(); // create a new object `Bubba` of Prisoner
//		Bubba.name = "Bubba";
//		Bubba.height = 2.08;
//		Bubba.sentence = 4;
//	    
//		Prisoner Twitch = new Prisoner(); // create a new object `Twicth` of Prisoner
//		Twitch.name = "Twitch";
//		Twitch.height = 2.08;
//		Twitch.sentence = 4;
//				
//		System.out.println(Bubba==Twitch); // to check if Bubba and Twitch are the same
//		
//		System.out.println(Bubba);
//		System.out.println(Twitch);

		// Exercise 2

//		Prisoner Bubba = new Prisoner();
//		Bubba.name = "Bubba";
//		Bubba.height = 2.08;
//		Bubba.sentence = 4;
//
//		Prisoner Twitch = new Prisoner();
//		Twitch.name = "Twitch";
//		Twitch.height = 1.73;
//		Twitch.sentence = 3;
//
//		Bubba = Twitch;
//
//		System.out.println(Bubba == Twitch);

		// Exercise 3

		// using `new` keyword to create a new object
		String Bubba = new String("Bubba");
		String Twitch = new String("Bubba");

		System.out.println(Bubba == Twitch);

//		// not using `new` keyword to create a new object
		String Bubba2 = "Bubba";
		String Twitch2 = "Bubba";

		System.out.println(Bubba2 == Twitch2);
	
	}

}
