package com.ap;

import java.util.Arrays;

public class RotetingArrayLeftRight {

	public static void main(String[] args) {

		int ar[] = { 10, 20, 30, 40, 50 };

		System.out.println(Arrays.toString(rotateLeft(ar.clone())));
		System.out.println(Arrays.toString(rotateRight(ar.clone())));

	}

	public static int[] rotateLeft(int ar[]) {
		int temp = ar[0];
		for (int i = 0; i < ar.length - 1; i++) {
			ar[i] = ar[i + 1];
		}
		ar[ar.length - 1] = temp;
		return ar;
	}

	public static int[] rotateRight(int ar[]) {
		int temp = ar[ar.length - 1];
		for (int j = ar.length - 1; j > 0; j--) {
			ar[j] = ar[j - 1];
		}
		ar[0] = temp;
		return ar;
	}

}
