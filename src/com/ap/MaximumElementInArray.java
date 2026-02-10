package com.ap;

public class MaximumElementInArray {
	public static void main(String[] args) {

		int[] a = { 50, 10, 30, 40, 60 };
//		int max = a[0];// 50 but here also present -ve value in arry
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < a.length; i++) {// 10,20,30,40,60
			if (a[i] > max) {// 60>50
				max = a[i];// 50,60
			}
		}
		System.out.println("Maximum element in array: " + max);
	}
}
