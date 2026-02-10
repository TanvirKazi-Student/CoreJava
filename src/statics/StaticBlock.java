package statics;

public class StaticBlock {

	static {
		System.out.println("static block 1");
	}
	static {
		System.out.println("static block 2");
	}

	public static void main(String[] args) {
		System.out.println("main method");
	}

	static {
		System.out.println("static block 3");
	}
}
