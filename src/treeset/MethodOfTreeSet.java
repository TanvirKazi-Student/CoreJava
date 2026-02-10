package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MethodOfTreeSet {

	public static void main(String[] args) {

		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("Pune");
		t1.add("Delhi");
		t1.add("Banglore");
		t1.add("channai");
		t1.add("Amaravati");
		t1.add("Hydrabad");
		t1.add("Ahmdabad");
		t1.add("Goa");
		t1.add("Nagpure");

//		t1.add(null);// TreeSet cn not take null
		System.out.println(t1);

		System.out.println(t1.ceiling("Noida"));// return same or Greter element
		System.out.println(t1.ceiling("Goa"));
		System.out.println(t1.floor("Goa"));// return same or Smaller element
		System.out.println(t1.floor("Noida"));
		System.out.println(t1.higher("Goa"));// return Greter element
		System.out.println(t1.lower("Goa"));// return Lower element

		Iterator<String> itr = t1.descendingIterator();// it's work same as iterator but it's follow descending order.

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		System.out.println(t1.descendingSet());// return as iterator ,over element in set in desending order
		System.out.println(t1.descendingSet());
		System.out.println(t1.first());// Returns the first (lowest) element
		System.out.println(t1.last());// Returns the last (Bigest) element
		System.out.println(t1.pollFirst());// Retrieves and removes the first (lowest) element,
		System.out.println(t1.pollLast());// Retrieves and removes the Last (Bigest) element,
		System.out.println(t1.subSet("Delhi", false, "mumbai", true));// return a view of set whose elements range from
																		// fromElement to toElement.
		System.out.println(t1.tailSet("Goa", false));// Returns a view of set whose elements are greater than or equal
														// to fromElement.
		System.out.println(t1);
	}

}

//   D
// B   P 
//A  c   