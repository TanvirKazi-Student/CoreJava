package accessmodifirechaild;

import accessmodifire.ProtectedAccessModifire;

public class ProtectedAccessModifireSubClassAnotherPackage extends ProtectedAccessModifire {
	
	protected ProtectedAccessModifireSubClassAnotherPackage() {
		
	}
	public static void main(String[] args) {
		ProtectedAccessModifireSubClassAnotherPackage p3 = new ProtectedAccessModifireSubClassAnotherPackage();
		p3.test();
		demo();
		System.out.println(sal);
		System.out.println(p3.a);
	}
}
