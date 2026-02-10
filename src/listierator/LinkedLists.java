package listierator;

import java.util.LinkedList;
import java.util.ListIterator;
//Write Program do reverse by useing iterator in linkedList.

public class LinkedLists {

	public static void main(String[] args) {

		LinkedList<Integer> l1 = new LinkedList<>();// no default capacity

		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);

		ListIterator<Integer> i = l1.listIterator(l1.size());

		while (i.hasPrevious()) {
			System.out.println(i.previous());
		}

	}
}
