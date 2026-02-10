package com.ap;

public class SumOfArray {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		System.out.println(sum);
	}
}
