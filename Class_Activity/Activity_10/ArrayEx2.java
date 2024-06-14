package Class_Activity.Activity_10;

public class ArrayEx2 {
	public static void main(String args[]) {
//		String[] browsers = new String[3];
		String[] browsers = new String[4]; // Change the size of the array to 4 to fix the error
		browsers[0] = "explorer";
		browsers[1] = "chrome";
		browsers[2] = "opera";
		browsers[3] = "firefox";

		System.out.println("size of array" + browsers.length);

		// Use for-each loop to display the contents of the array
		for (String browser : browsers) {
			System.out.println(browser);
		}
	}
}
