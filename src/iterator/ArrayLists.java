package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);
		a1.add(80);
		a1.add(90);
		a1.add(100);
//
//		for (Integer i : a1) {
//			System.out.println(i);
//		}
		
//		int sum = 0;
//		for (Integer i : a1) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		Iterator<Integer> e1 = a1.iterator();
		
		while (e1.hasNext()) {
			System.out.println(e1.next());
		}
		System.out.println(e1.next());//NoSuchElementException
		System.out.println(e1.hasNext());

	}
}
