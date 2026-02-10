package com.ap;

public class SurchElementAndReturnCount {

	public static void main(String[] args) {

		int[] ar = { 10, 20, 30, 30, 40, 50 };
		System.out.println(linearSearch(ar));
	}

	public static int linearSearch(int[] ar) {
		int search = 30;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == search) {
				count++;
			}
		}
		return count;

	}
}
