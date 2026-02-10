package accessmodifire;

public class ProtectedAccessModifireSubClass extends ProtectedAccessModifire{

	public static void main(String[] args) {
		ProtectedAccessModifireSubClass p1 = new ProtectedAccessModifireSubClass();
		p1.test();
		demo();
		System.out.println(sal);
		System.out.println(p1.a);
	}
}
