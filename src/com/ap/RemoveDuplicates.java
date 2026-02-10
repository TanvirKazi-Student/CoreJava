package com.ap;

import java.util.Arrays;

//use two pointer Approach
public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] ar = { 2, 4, 2, 3, 2, 1, 3, 6 };
		System.out.println(Arrays.toString(removeDuplicates(ar)));
	}

	public static int[] removeDuplicates(int[] ar) {
		int[] ct = frequncy(ar);
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ct[i] == -1) {
				count++;
			}
		}
		int[] ans = new int[ar.length - count];
		for (int i = 0, j = 0; i < ar.length; i++) {
			if (ct[i] != -1) {
				ans[j] = ar[i];
				j++;
			}
		}
		return ans;
	}

	public static int[] frequncy(int[] ar) {
		int[] ct = new int[ar.length];

		for (int i = 0; i < ar.length; i++) {
			if (ct[i] != -1) {
				int count = 1;
				for (int j = i + 1; j < ar.length; j++) {
					if (ar[i] == ar[j]) {
						count++;
						ct[j] = -1;
					}
				}
				ct[i] = count;
//				System.out.println("Element " + ar[i] + " occurs " + count + "times");

			}
		}
		return ct;
	}
}
