package finalvariable;

public class FinalStaticVariable {

//	static final char ch;//CTE
	static final int a = 1000;
	static final double PI;
	static {
		PI = 72.3;
	}

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(PI);
	}

}
