package Study.Week_11;

public class TraverseArrays {
	public static void main(String args[]) {
		// -- Declare an array of integers -- //
		int[] numbers = { 10, 20, 30, 40, 50 };

		// -- For loop to traverse the array -- //
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]); // It will print all the elements of the array
		}

		System.out.println("\nExample 2");

		int[] arr = { 4, 8, 2, 7, 5, 1, 6, 3 };
		int target = 5; // to find the index of this element

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) { // the index number is equal to the target
				System.out.println("Element found at index: " + i);
			}
		}

		System.out.println("\nExample 3");

		int[] array = { -20, 19, 1, 5, -1, 27, 19, 5 };
		int min = array[0]; // Initialize the minimum value -20 to min

		for (int index = 0; index < array.length; index++) {
			if (array[index] < min) { // check if the current element is less than the minimum value
				min = array[index]; // if it is, assign the current element to min
			}
		}
		System.out.println("The minimum value in the array is: " + min);
	}
}