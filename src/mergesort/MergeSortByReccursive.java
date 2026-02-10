package mergesort;

import java.util.Arrays;

//merge the sort by recursive (divide and conquer)
public class MergeSortByReccursive {

	public static void main(String[] args) {
		int[] a = { 100, 86, 71, 68, 54, 9, 5, 0 };
		mergeSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	public static void mergeSort(int[] a, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(a, start, mid);
			mergeSort(a, mid + 1, end);
			merge(a, start, mid, end);
		}
	}

	public static void merge(int[] a, int start, int mid, int end) {
		int ans[] = new int[a.length];
		int i = start, j = mid + 1, k = start;

		while (i <= mid && j <= end) {
			if (a[i] > a[j]) {
				ans[k++] = a[j++];
			} else {
				ans[k++] = a[i++];
			}
		}
		// Copy remaining elements from left
		while (i <= mid) {
			ans[k++] = a[i++];
		}
		// Copy remaining elements from right
		while (j <= end) {
			ans[k++] = a[j++];
		}
		// Copy back into original array
		for (int k2 = start; k2 <= end; k2++) {
			a[k2] = ans[k2];
		}
	}

}
