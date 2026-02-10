package accessmodifire;

public class ProtectedAccessModifireChailed {

	public static void main(String[] args) {
		ProtectedAccessModifire p2 = new ProtectedAccessModifire();// object created by sub class
		p2.test();
		ProtectedAccessModifire.demo();
		System.out.println(ProtectedAccessModifire.sal);
		System.out.println(p2.a);
	}
}
