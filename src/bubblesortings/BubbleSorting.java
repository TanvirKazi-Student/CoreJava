package bubblesortings;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		int[] a = { 2, 4, 3, 5, 6 };
		System.out.println(Arrays.toString(bubbleSorting(a)));
	}

	public static int[] bubbleSorting(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}
}
