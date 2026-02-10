package listierator;

import java.util.ListIterator;
import java.util.Stack;
//Write Program do reverse by useing iterator in Stack.
public class Stacks {

	public static void main(String[] args) {

		Stack<Integer> s1 = new Stack<>();// capacity default 10

		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(70);
		s1.add(80);
		s1.add(90);
		s1.add(100);
		
		
		ListIterator<Integer> l1 = s1.listIterator(s1.size());
		
		while(l1.hasPrevious()) {
			System.out.println(l1.previous());
		}
	}
}
