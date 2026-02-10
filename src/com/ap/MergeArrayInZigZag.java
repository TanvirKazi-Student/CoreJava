package com.ap;

import java.util.Arrays;
//write the program in noot book
public class MergeArrayInZigZag {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6, 7 };
		int[] b = { 8, 9, 10, 11, 12 };

		int[] result = mergeArrayInZigZag(a, b);
		System.out.println(Arrays.toString(result));
	}

	public static int[] mergeArrayInZigZag(int[] a, int[] b) {
		int[] ans = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		while (j < ans.length) {
			if (i < (a.length < b.length ? a.length : b.length)) {
				ans[j] = a[i];
				ans[j + 1] = b[i];
				j += 2;
				i++;

			} else {
				if (i < a.length) {
					ans[j] = a[i++];
				} else if (i < b.length) {
					ans[j] = b[i++];
				}
				j++;
			}

		}
		return ans;
	}
}