package listierator;

import java.util.ListIterator;
import java.util.Vector;
//Write Program do reverse by useing iterator in Vector.
public class Vectors {
	public static void main(String[] args) {

		Vector<Integer> v1 = new Vector<>();// default capacity 10

		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		v1.add(60);
		v1.add(70);
		v1.add(80);
		v1.add(90);
		v1.add(100);

		ListIterator<Integer> l1 = v1.listIterator(v1.size());

		while (l1.hasPrevious()) {
			System.out.println(l1.previous());

		}
	}
}
