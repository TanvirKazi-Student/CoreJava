package statics;

public class StaticVariable {

	static int a = 100;

	public static void main(String[] args) {
		System.out.println(a);

		String a = "ABC";
		System.out.println(a);

		demo();
		System.out.println(StaticVariable.a);
	}

	public static void demo() {
		System.out.println(a);
		int a = 110;
		System.out.println(a);
		a = a;
		System.out.println(a);
		System.out.println(StaticVariable.a);
	}
}
