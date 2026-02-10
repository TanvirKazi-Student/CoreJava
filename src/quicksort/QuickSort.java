package quicksort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] a = { 30, 40, 0, 5, 6, 90, 1, 50, 7 };
		quickSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	public static void quickSort(int[] ar, int start, int end) {
		if (start < end) {
			int index = portition(ar, start, end);
			quickSort(ar, start, index - 1);
			quickSort(ar, index + 1, end);
		}
	}

	private static int portition(int[] ar, int start, int end) {
		int ref = ar[start];
		int i = start, j = end;
		while (i < j) {
			while (i <= end && ar[i] <= ref) {
				i++;
			}
			while (j > start && ar[j] >= ref) {
				j--;
			}
			if (i < j) {
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			} else {
				break;
			}
		}
		int temp = ar[start];
		ar[start] = ar[j];
		ar[j] = temp;

		return j;
	}
}
