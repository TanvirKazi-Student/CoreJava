package com.ap;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5, 6 };
		int[] temp = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			temp[i] = ar[i];
		}
		System.out.println(Arrays.toString(temp));
	}
}
