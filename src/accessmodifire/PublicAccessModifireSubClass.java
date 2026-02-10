package accessmodifire;

public class PublicAccessModifireSubClass extends PublicAccessModifire {

	public static void main(String[] args) {
		PublicAccessModifireSubClass p1 = new PublicAccessModifireSubClass();// sub class object
		System.out.println(p1.a);
		System.out.println(PublicAccessModifire.sal);
		p1.test();
		PublicAccessModifire.demo();

	}
}
