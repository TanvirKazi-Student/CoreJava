package com.ap;

import java.util.Arrays;

public class Intersect {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 3, 6 };
		int result[] = intersector(a, b);
		System.out.println(Arrays.toString(result));
	}

	public static int[] intersector(int[] a, int[] b) {
		boolean[] check = new boolean[b.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					check[j] = true;
					count++;
				}
			}
		}
		int[] ans = new int[count];
		int index = 0;

		for (int j = 0; j < b.length; j++) {
			if (check[j]) {
				ans[index] = b[j];
				index++;
			}
		}
		return ans;

	}
}