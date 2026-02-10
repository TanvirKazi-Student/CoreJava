package com.ap;

public class EvenElement {

	public static void main(String[] args) {
		int[] a = { 1, 3, 4, 8, 9, 10, 12 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
