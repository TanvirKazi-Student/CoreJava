package object;

import java.util.ArrayList;

//== opratore compare the data (primitive datatype)
//== opratore compare the object refrance (non primitive datatype)

public class EqulsOprator {

	public static void main(String[] args) {

		System.out.println("== opratore compare the data (primitive datatype)");
		byte a1 = 126;
		byte a2 = 126;

		short s1 = 129;
		short s2 = 129;

		int id1 = 101;
		int id2 = 101;

		long l1 = 123;
		long l2 = 123;

		char a = 'A';
		char b = 'A';

		float f1 = 1233.32f;
		float f2 = 123.32f;

		double d1 = 3423.324;
		double d2 = 23443.34;

		System.out.println(a1 == a2);
		System.out.println(s1 == s2);
		System.out.println(id1 == id2);
		System.out.println(l1 == l2);
		System.out.println(a == b);
		System.out.println(f1 == f2);
		System.out.println(d1 == d2);

		System.out.println("== opratore Compare object refrance for non primitive data type");
		String p1 = new String("Hello");// String, Integer, ArrayList, Object
		String p2 = new String("Hello");

		Integer i1 = new Integer(20);
		Integer i2 = new Integer(30);

		ArrayList<Integer> e1 = new ArrayList<Integer>();
		e1.add(20);
		e1.add(30);
		ArrayList<Integer> e2 = new ArrayList<Integer>();
		e2.add(20);
		e2.add(30);

		Object ob1 = new Object();
		Object ob2 = new Object();

		System.out.println(p1 == p2);
		System.out.println(i1 == i2);
		System.out.println(e1 == e2);
		System.out.println(ob1 == ob2);

	}
}