package Study.Week_11;

public class StringArray {

	public static void main(String args[]) {
		String names[] = { "Tom", "David", "Mike" };

		System.out.println("Example 1");
		
		// -- Normal for loop to traverse the array -- //
		for (int idx = 0; idx < names.length; idx++) {
			System.out.println(names[idx]);
		}

		System.out.println("\nExample 2");
		// -- For each loop to traverse the array -- //
		// name means the variable that will hold the value of each element in the array
		// and names is the array that we are traversing
		for (String name : names) {
			System.out.println(name);
		}
	}
}