package accessmodifire;

public class PublicAccessModifire {

	public int a = 10;
	public static double sal = 1000;

	public PublicAccessModifire() {

	}

	public void test() {
		System.out.println("static with public method of test");

	}

	public static void demo() {
		System.out.println("non static with public method of demo");
	}

	public static void main(String[] args) {
		PublicAccessModifire p1 = new PublicAccessModifire();
		System.out.println(p1.a);
		System.out.println(sal);
		p1.test();
		demo();
	}
}
