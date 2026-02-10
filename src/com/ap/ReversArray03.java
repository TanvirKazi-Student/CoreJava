package com.ap;

import java.util.Arrays;
//Reverse Array Without using temp
//This is the best way
public class ReversArray03 {

	public static void main(String[] args) {
		int[] ar = { 10, 20, 30, 40, 50 };

		for (int i = 0, j = ar.length - 1; i < j; i++, j--) {
			ar[i] = ar[i] + ar[j];// 60 = 10 + 50
			ar[j] = ar[i] - ar[j];// 10 = 60 - 50
			ar[i] = ar[i] - ar[j];// 50 = 60 - 10
		}
		System.out.println(Arrays.toString(ar));
	}
}