package accessmodifire;

public class PublicAccessModifireaAnotherClass {

	public static void main(String[] args) {
		PublicAccessModifire p1 = new PublicAccessModifire();//sun class object
		System.out.println(p1.a);
		System.out.println(PublicAccessModifire.sal);
		p1.test();
		PublicAccessModifire.demo();
	}
}
