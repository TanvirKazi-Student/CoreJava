package com.ap;

public class SecondMinimumElementInArray {

	public static void main(String[] args) {
		int[] a = { 50, 100, 30, 40, 60 };
		System.out.println(SecondMinimumElementInArray(a));
	}

	public static int SecondMinimumElementInArray(int[] a) {
		int min = Integer.MAX_VALUE;
		int secdMin = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				secdMin = min;
				min = a[i];
			} else if (a[i] < secdMin && a[i] != min) {
				secdMin = a[i];
			}
		}
		return secdMin;
	}
}
