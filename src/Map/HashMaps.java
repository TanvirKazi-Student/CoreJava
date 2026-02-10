package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {

	public static void main(String[] args) {

		HashMap<Integer, String> num = new HashMap<Integer, String>();

		num.put(101, "Raju");
		num.put(324, "Tanvir");
		num.put(432, "Soyab");
		num.put(3442, "Rohan");
//		num.put(3442, "Rohan");//not allow duplocate key
		num.put(3443, "Rohan");// allow duplicate data

		Set<Integer> keys = num.keySet();// set of key
		System.out.println(keys);

		Collection<String> values = num.values();// collection of valuse
		System.out.println(values);

		Set<Map.Entry<Integer, String>> entry = num.entrySet();

		System.out.println(entry);

		System.out.println(num);
	}
}
