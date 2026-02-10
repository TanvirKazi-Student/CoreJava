package arraylist;

import java.util.ArrayList;

public class MyArrayList {
// interview qution can we add element direct in 5th index in arraylist => no
	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		a1.add(10);
//		a1.add(5,40);//geting error because thy not add null in index 1,2,3,4
		a1.add(1, 11);
		a1.add(1, 12);
		a1.add(1, 13);
//		a1.fillAt(2, 100, 200, 300); //here use method which fill element like array
		System.out.println(a1);
	}
}
