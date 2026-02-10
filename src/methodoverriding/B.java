package methodoverriding;

public class B extends A {

	static int a = 11;// variable shadoing
	char ch = 'd';// variable overriding

	public static void test() {// method shadoing
		System.out.println("static test method in B class");
	}

	@Override
	public void demo() {// method overridin
		System.out.println("non static demo method in B class");
	}

	public static void main(String[] args) {
		A a = new B();
		System.out.println(a.ch);
		System.out.println(a);

		a.demo();
		a.test();

	}

}
