package com.ap;

public class DesignMethodtoExceptArray {
//Search Elememt In Given Array
	public static void main(String[] args) {
		int[] ar = { 10, 20, 30, 40, 50 };
		System.out.println(linearSearch(ar));
	}

	public static int linearSearch(int[] ar) {
		int search = 30;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == search) {
				return 1;
			}
		}
		return -1;
	}
}
