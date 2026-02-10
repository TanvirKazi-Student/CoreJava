package com.ap;

import java.util.Arrays;

public class InsertLast {

	public static void main(String[] args) {
		int[] a = { 3, 4, 6, 3, 2, 56, 7 };
		System.out.println(Arrays.toString(insertLast(a, 23)));
	}

	public static int[] insertLast(int[] ar, int ele) {
		int ans[] = new int[ar.length + 1];

		for (int i = 0; i < ar.length; i++) {
			ans[i] = ar[i];
		}
		ans[ans.length - 1] = ele;

		return ans;
	}
}
