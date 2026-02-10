package com.ap;

public class MinimumElementInArray {
	public static void main(String[] args) {

		int[] a = { 50, 100, 30, 40, 60 };
//		int min = a[0];// 50 but here also present -ve value in array
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < a.length; i++) {// 100,30,40,60
			if (a[i] < min) {// 50<100
				min = a[i];// 50,30,
			}
		}
		System.out.println("Minimum element in array: " + min);
	}
}
