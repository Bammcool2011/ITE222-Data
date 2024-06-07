package Quiz;

public class Quiz_1 {

//	int a;S
//	int b;
//
//	// Constructor 1
//	public Example(int a) {
//	        this.a = a;
//	    }
//
//	// Constructor 2 - Same argument type as Constructor 1
//	public Example(int b) {  // Compilation error: constructor Example(int) is already defined in class Example
//	        this.b = b;
//	    }
//
//	public static void main(String[] args) {
//		Example obj = new Example(5);
//	}
//}

	{
		int a;
		int b;
	}

	void meth(int i, float j) {
		i *= 2;
		j /= 2;
	}

	public static void main(String args[]) {
		Quiz_1 obj = new Quiz_1();
		int x = 10;
		int b = 20;
		obj.meth(x, b);
		System.out.println(x + " " + b);
	}
}

//	void method(int x, double y) {
//		System.out.println(1);
//	}
//	
//	void method(double x, int y) {
//		System.out.println(2);
//	}
//	
//	public static void main(String[] args) {
//		Quiz_2 Q = new Test();
//		Q.method(1.0, 2);
//		Q.method(1, 2.0);
//		Q.method(1, 2); // <--- Erorr because the method definded isn't `int` number
//	}
