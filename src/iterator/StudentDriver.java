package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StudentDriver {

	public static void main(String[] args) {

		ArrayList<Student> s1 = new ArrayList<Student>();

		s1.add(new Student(1, "Tanvir", "Fabtech", "cs"));
		s1.add(new Student(2, "Soyab", "cop", "it"));
		s1.add(new Student(3, "Abhijit", "Dypatil", "ai"));
		s1.add(new Student(4, "Rohan", "zile", "civil"));

//		System.out.println(s1);
		
		Iterator<Student> l1 = s1.iterator();
		
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
	}
}
