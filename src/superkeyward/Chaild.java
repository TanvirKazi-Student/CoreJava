package superkeyward;

import java.lang.classfile.Superclass;

public class Chaild extends Father {

	static String name = "ramu";

	private void show() {
		System.out.println(name);
		System.out.println(super.name);
		super.displayed();
		System.out.println(this);// we can print this() call Statement
 //		System.out.println(super);//we can not print super() call Statement
	}

	public static void main(String[] args) {
       Chaild ch = new Chaild();
       ch.show();
	}
}
