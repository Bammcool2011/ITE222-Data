package Study.Week_11;

public class IndexOutofBounds {
	public static void main(String args[]) {
		int primes[] = { 2, 3, 5, 7, 11, 13, 17 };
		System.out.println("Array length: " + primes.length);
		primes[10] = 20;

		System.out.println("The first few prime numbers are: ");
		for (int i : primes) {
			System.out.println(i);
			
			// The following line will throw an IndexOutOfBoundsException
			// because the array has only 7 elements
		}
	}
}
