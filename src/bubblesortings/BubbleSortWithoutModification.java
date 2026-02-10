package bubblesortings;

import java.util.Arrays;

public class BubbleSortWithoutModification {
	public static void main(String[] args) {
		int[] a = { 2, 4, 3, 5, 6 };
		int pass = bubbleSortWithoutModification(a);
		System.out.println(Arrays.toString(a));
		System.out.println(pass);
	}

	public static int bubbleSortWithoutModification(int[] a) {
		int passCount = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				passCount++;
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
		return passCount;

	}
}
