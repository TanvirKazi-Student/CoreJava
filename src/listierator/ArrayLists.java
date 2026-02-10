package listierator;

import java.util.ArrayList;
import java.util.ListIterator;

//Write Program do reverse by useing iterator in Arraylist.
public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<Integer> e1 = new ArrayList<Integer>();// default capacity 10

		e1.add(10);
		e1.add(20);
		e1.add(30);
		e1.add(40);
		e1.add(50);
		e1.add(60);
		e1.add(70);
		e1.add(80);
		e1.add(90);
		e1.add(100);

		ListIterator<Integer> i = e1.listIterator(e1.size());

		while (i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}
}
