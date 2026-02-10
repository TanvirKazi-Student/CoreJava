package com.ap;

//Use two pointer Approch
public class CheckArrayPalindromOrNots {

	public static void main(String[] args) {
		int[] a = { 2, 2, 1 };
		isPalindrom(a);
	}

	public static void isPalindrom(int[] a) {
		int i = 0, j = a.length - 1 - i;
		for (i = 0, j = a.length - 1; i < a.length; i++, j--) {
			if (a[i] != a[j]) {
				break;
			}
			if (i < j) {
				System.out.println("not palindrom");
			} else {
				System.out.println("palindrom");
			}
		}

	}

}
