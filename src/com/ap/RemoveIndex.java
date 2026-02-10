package com.ap;

import java.util.Arrays;

public class RemoveIndex {

	public static void main(String[] args) {

		int[] a = { 3, 4, 6, 3, 2, 56, 7 };
		System.out.println(Arrays.toString(removeIndex(a, 3)));

	}

	public static int[] removeIndex(int[] ar, int index) {
		if (index >= 0 && index < ar.length) {
			int[] ans = new int[ar.length - 1];
			for (int i = 0; i < ar.length; i++) {
				if (i < index) {
					ans[i] = ar[i];
				} else if (i > index) {
					ans[i - 1] = ar[i];
				}
			}
			return ans;
		}
		return ar;

	}
}
