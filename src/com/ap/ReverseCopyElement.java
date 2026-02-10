package com.ap;

import java.util.Arrays;

public class ReverseCopyElement {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = new int[a.length];
		for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
			b[a.length - 1 - i] = a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}
