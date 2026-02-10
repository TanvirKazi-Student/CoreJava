package com.ap;

import java.util.Iterator;
//Reverse Array Using temp
public class ReversArray02 {

	public static void main(String[] args) {
		int[] ar = { 10, 20, 30, 40, 50 };

		for (int i = 0, j = ar.length - 1; i < ar.length - 1; i++, j--) {
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			System.out.println(ar[i]);
		}
	}
}
