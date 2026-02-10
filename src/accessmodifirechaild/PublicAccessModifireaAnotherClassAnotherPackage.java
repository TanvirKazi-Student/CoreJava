package accessmodifirechaild;

import accessmodifire.PublicAccessModifire;

public class PublicAccessModifireaAnotherClassAnotherPackage {

	public static void main(String[] args) {
		PublicAccessModifire p1 = new PublicAccessModifire();
		System.out.println(p1.a);
		System.out.println(PublicAccessModifire.sal);
		p1.test();
		PublicAccessModifire.demo();
	}
}
