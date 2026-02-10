package com.ap;

public class FindFrequncyOfEachElement {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 5, 6, 6, 4, 3, 2, 6 };
		FindFrequncyOfEachElement(a);
	}

	public static void FindFrequncyOfEachElement(int[] a) {
		int[] ct = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (ct[i] != -1) {
				int count = 1;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						ct[j] = -1;
					}
				}
				ct[i] = count;
				System.out.println("Element " + a[i] + " occurs " + count + "times");

			}
		}

	}
}
