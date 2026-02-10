package com.ap;

public class SmallestConsecutiveRepeatingArray {
	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 5, 5, 6, 6 };
		smallestConsecutiveRepatingSubArray(a);
	}

	public static void smallestConsecutiveRepatingSubArray(int[] a) {
		int min = 2, ct = 0, index = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				ct++;
			} else if (ct > 0) {
				if (ct <= min) {
					min = ct;
					index = i;
				}
				ct = 0;
			}
		}
		System.out.println("Element: " + a[index] + " " + "length: " + (min+1));
	}
}
