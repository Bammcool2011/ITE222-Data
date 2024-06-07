package Study.Week_10;

public class RedBumper {

//	// -- static variable mean that all instances of the class share the same variable -- //
//	static String orientation = "left";
//
//	public static void main(String[] args) {
//		RedBumper b01 = new RedBumper();
//		RedBumper b02 = new RedBumper();
//
//	// -- the output will be "left" for both b01 and b02 -- //
//		System.out.println(b01.orientation);
//		System.out.println(b02.orientation);
//	}

// -------------------------------------------------------------------------------------------- // 

	double rotation;

	public static void main(String[] args) {
		RedBumper bumper1 = new RedBumper();
		RedBumper bumper2 = new RedBumper();

		bumper1.rotation = 30.0;
		bumper2.rotation = 45.0;
		
		// -- the output will be different because the rotation is an instance variable -- //
		System.out.println("Initial rotation of bumper1: " + bumper1.rotation + " degrees");
		System.out.println("Initial rotation of bumper2: " + bumper2.rotation + " degrees");
	}

}
