package finalvariable;

public class FinalLocalVariable {

	public void test() {
		final double PI = 3.14;
//	PI = 3.15; // CTE
		System.out.println(PI);
	}
//	PI = 3.15;  // CTE

	public static void main(String[] args) {
		FinalLocalVariable f1 = new FinalLocalVariable();
		f1.test();
	}
}
