package com.ap;

import java.util.Arrays;

public class MergeAtIndex {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(mergeAtIndex(new int[] { 10, 20, 30, 40 }, new int[] { 1, 2, 3 }, 4)));
	}

	public static int[] mergeAtIndex(int[] a, int[] b, int index) {
		if (index >= 0 && index <= a.length) {
			int[] ans = new int[a.length + b.length];
			for (int i = 0, j = 0; j < ans.length; j++) {
				if (j < index) {
					ans[j] = a[j];
				} else if (i < b.length) {
					ans[j] = b[i];
					i++;
				} else {
					ans[j] = a[j - b.length];
				}
			}
			return ans;
		}
		return a;

	}

}
