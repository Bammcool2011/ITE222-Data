package Study.Week_8;

public class OverloadMethods {

	// Calculate y = mx + b
	public double calcY(double m, double x, double b) {
		double y = 0;
		y = m * x + b;
		return y;
	}

	public double calcY(double m, double x) {
//		double y = 0;
//		y = m * x;
//		return y;

		return calcY(m, x, 0);
	}

	public static void main(String[] args) {
		OverloadMethods calculator = new OverloadMethods();

		// Calculate y = 2x + 3 for x = 5
		double result1 = calculator.calcY(2, 5, 3);
		System.out.println("Result 1: " + result1);

		// Calculate y = 3x for x = 4
		double result2 = calculator.calcY(3, 4);
		System.out.println("Result 2: " + result2);
	}
}
