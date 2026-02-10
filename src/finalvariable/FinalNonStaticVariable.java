package finalvariable;

public class FinalNonStaticVariable {

	final int a;//CTE
	
	final double sal = 1000.0;
	
	{
//		a = 10; // give in non static block value to final non static vaiable
	}

	public FinalNonStaticVariable() {
		a = 20; // give in Constroctor value to final non static vaiable
	}

	public static void main(String[] args) {
		FinalNonStaticVariable f1 = new FinalNonStaticVariable();
		System.out.println(f1.a);
		System.out.println(f1.sal);
}
}
