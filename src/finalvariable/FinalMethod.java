package finalvariable;

public abstract class FinalMethod {
// declear final non staic method overriding will stop
	public final void demo() {
		System.out.println("Non staic method of the demo class");

	}

	public final static void test() {
		System.out.println("staic method of the test class");

	}
//	public final static void test() {

//	}

	// we can not declear abstract method final
//	public abstract final void hello();

}
