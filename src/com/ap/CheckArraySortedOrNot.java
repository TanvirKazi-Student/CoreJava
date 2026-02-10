package com.ap;

public class CheckArraySortedOrNot {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		boolean b = checkArraySortedOrNot(a);
		System.out.println(b);
	}

	public static boolean checkArraySortedOrNot(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
