package statics;

public class StaticVariables {

	static int i;
	static double d;

	static {
		System.out.println(i);
		i = 100;
		System.out.println("i after the added: " + i);
		demo();
	}

	public static void demo() {
		System.out.println(i);
		i = -1;
		System.out.println(i);

	}

	public static void main(String[] args) {

	}
}
