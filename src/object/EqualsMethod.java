package object;

import java.util.ArrayList;

//.equals() method is used to compare objects data(non-primitive data types)
public class EqualsMethod {
	public static void main(String[] args) {
		String s1 = new String("Hello");// String, Integer, ArrayList, Object
		String s2 = new String("Hello");

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

		System.out.println(s1.equals(s2));
		System.out.println(i1.equals(i2));
		System.out.println(e1.equals(e2));
		System.out.println(ob1.equals(ob2));//Object.equals() also compares references
	}
}
