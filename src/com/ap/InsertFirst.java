package com.ap;

import java.util.Arrays;

public class InsertFirst {

	public static void main(String[] args) {
		int[] a = { 3, 4, 6, 3, 2, 56, 7 };
		System.out.println(Arrays.toString(insertFirst(a, 23)));
	}

	public static int[] insertFirst(int[] ar, int ele) {
		int ans[] = new int[ar.length + 1];

		ans[0] = ele;
		for (int i = 1; i < ans.length; i++) {
			ans[i] = ar[i - 1];
		}
		return ans;
	}
}
