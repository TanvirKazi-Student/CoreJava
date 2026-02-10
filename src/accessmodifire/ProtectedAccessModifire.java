package accessmodifire;

public class ProtectedAccessModifire {

	protected int a = 10;
	protected static double sal = 200.0;

	protected ProtectedAccessModifire() {
		
	}
	protected void test() {
		System.out.println("protected with non staic method test");
	}

	protected static void demo() {
		System.out.println("protected with non staic method demo");
	}

	public static void main(String[] args) {
		ProtectedAccessModifire p1 = new ProtectedAccessModifire();
		p1.test();
		demo();
		System.out.println(sal);
		System.out.println(p1.a);

	}
}
