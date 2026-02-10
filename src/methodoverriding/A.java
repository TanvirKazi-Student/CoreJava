package methodoverriding;

public class A {

	static int a = 10;
	char ch = 'e';
    
	public static void test() {
		System.out.println("static test method in A class");
	}
	 
	public void demo() {
		System.out.println("non static demo method in A class");

	}
	
}
