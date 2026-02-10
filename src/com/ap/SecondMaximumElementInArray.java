package com.ap;

import java.util.Arrays;

public class SecondMaximumElementInArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 6, 5 };
		System.out.println(secondMaximumElementInArray(a));
	}

	public static int secondMaximumElementInArray(int[] a) {
		int max = Integer.MIN_VALUE;
		int secdMax = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secdMax = max;
				max = a[i];
			} else if (a[i] > secdMax && a[i] != max) {
				secdMax = a[i];
			}
		}
		return secdMax;

	}
}
