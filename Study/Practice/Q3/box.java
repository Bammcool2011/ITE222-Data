package Study.Practice.Q3;

public class box {
	double width;
	double height;
	double depth;

	box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public void myMethod() {
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		System.out.println("Depth: " + depth);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		box b = new box(25, 50, 25);
		b.myMethod();
	}
}
