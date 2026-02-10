package com.ap;

import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {
		int[] a = { 3, 4, 6, 3, 2, 56, 7 };
		System.out.println(Arrays.toString(insertElement(a, 6, 3)));
	}

	public static int[] insertElement(int[] ar, int ele, int index) {
		if (index >= 0 && index < ar.length) {
			int[] ans = new int[ar.length + 1];

			for (int i = 0; i < ans.length; i++) {
				if (i < index) {
					ans[i] = ar[i];
				} else if (i == index) {
					ans[i] = ele;
				} else {
					ans[i] = ar[i - 1];
				}
			}
			return ans;
		} else {
			return ar; // Return original array if index is invalid
		}
	}
}
