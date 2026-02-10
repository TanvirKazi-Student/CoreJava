package com.ap;

public class CheckArrayPalindromOrNot {

	public static void main(String[] args) {
		int[] a = { 2, 1, 2};
		if (isPalindrom(a)) {
			System.out.println("Palindromic");
		} else {
			System.out.println("not Palimdramic");
		}
	}

	public static boolean isPalindrom(int[] a) {

		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
			if (a[i] != a[j]) {
				return false;
			}
		}
		return true;
	}

}
