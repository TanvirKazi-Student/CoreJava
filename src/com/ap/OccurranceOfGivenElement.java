package com.ap;

import java.util.Arrays;

public class OccurranceOfGivenElement {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 5 };
		System.out.println(OccuranceOfElement(a, 5));
	}

	public static int OccuranceOfElement(int[] a, int ele) {
		int count = 0;
		int i = 0;
		int j = a.length - 1;
		while (i <= j) {
			if (a[i] == ele) {
				count++;
			}
//			if(a[j] == ele) {
			if (i != j && a[j] == ele) {
				count++;
			}
			i++;
			j--;
		}
		return count;

	}
}
