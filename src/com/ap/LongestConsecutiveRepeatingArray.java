package com.ap;

public class LongestConsecutiveRepeatingArray {
//Array
	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 5, 5, 6, 6 };

		longesteRepatingSubSqunce(a);
	}

	public static void longesteRepatingSubSqunce(int[] a) {
		int max = 0, ct = 0, index = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				ct++;
			} else if (ct > 0) {
				if (ct > max) {
					max = ct;
					index = i;
				}
				ct = 0;
			}
		}
		System.out.println("Value: " + a[index] + ", Length: " + (max + 1));
	}
}
