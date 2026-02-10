package mergesort;

import java.util.Arrays;

//Merge sort using two pointer(i,j) approach.
public class MergeSort {

	public static void main(String[] args) {
		int[] a = { 1, 5, 6, 7 };
		int[] b = { 2, 3, 4, 8, 9, 10 };

		System.out.println(Arrays.toString(mergeSort(a, b)));
	}

	public static int[] mergeSort(int[] a, int[] b) {
		int[] ans = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length) {// not go out of bound so use this condition
			if (a[i] <= b[j]) {// if first array element < second array element insert first array element and
				// increase the first array index
            ans[k++] = a[i++];
			}
            if (a[i] > b[j]) {// if second array element < first array element insert second array element and
				// increase the second array index
				ans[k++] = b[j++];

			}
			while (i < a.length) {// Remaining element of first array inserting
				ans[k++] = a[i++];

			}
			while (j < b.length) {// Remaining element of second array inserting
				ans[k++] = b[j++];

			}
		}
		return ans;
	}
}
