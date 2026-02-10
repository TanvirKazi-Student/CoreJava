package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CollectionMethods {

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
		a1.add(90);
		a1.add(100);

		System.out.println(Collections.addAll(a1, 1, 2, 3, 4, 5));
		Collections.sort(a1);

		System.out.println(a1);

		System.out.println(Collections.disjoint(a1, Arrays.asList(120, 130, 1700)));

		System.out.println(Collections.frequency(a1, 10));

		System.out.println(Collections.binarySearch(a1, 30));

		System.out.println(Collections.indexOfSubList(a1, Arrays.asList(10, 20, 30)));

		System.out.println(Collections.max(a1));
		System.out.println(Collections.min(a1));

		System.out.println(Collections.nCopies(4, 1000));

		Collections.reverse(a1);
		System.out.println(a1);

		Comparator<Integer> c = Collections.reverseOrder();
		Collections.sort(a1, c);
		System.out.println("Sorted in Reverse Order: " + a1);
		
		Collections.rotate(a1, 3);
        System.out.println(a1);
        
        
		Collections.shuffle(a1);
		System.out.println(a1);
		
		
		Collections.swap(a1, 3, 8);
		System.out.println(a1);
		

	}
}
