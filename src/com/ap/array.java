package com.ap;

public class array {
	public static void main(String[] args) {
		int[] a = { 1, 2, 1 };
		System.out.println(isPalindrom(a));
	}

	public static boolean isPalindrom(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0, j = a.length ; i < a.length; i++, j--) {
			b[a.length - 1 - i] = a[i];
			if (a[i] == b[a.length - 1 - i]) {
				return true;
			}
		}
		return false;
	}
}
