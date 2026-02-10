package mergesort;

import java.util.Arrays;

//one half sorted one half unsorted
//use two pointer approch
// you tub
public class MergeSortRecursive {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 23, 13, 56, 9 };
		int[] sorted = mergeSortRecursive(a);
		System.out.println(Arrays.toString(sorted));
	}

	public static int[] mergeSortRecursive(int[] array) {
		if (array.length == 1) {
			return array;
		}

		int mid = array.length / 2;

		int[] left = Arrays.copyOfRange(array, 0, mid);
		int[] right = Arrays.copyOfRange(array, mid, array.length);
		left = mergeSortRecursive(left);
		right = mergeSortRecursive(right);
		return marge(left, right);

	}

	public static int[] marge(int[] left, int[] right) {
		int[] ans = new int[left.length + right.length];
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {// not go out of bound so use this condition
			if (left[i] < right[j]) {
				ans[k] = left[i];
				i++;
				k++;
			} else {
				ans[k] = right[j];
				j++;
				k++;
			}
			while (i < left.length) {
				ans[k] = left[i];
				i++;
				k++;
			}
			while (j < right.length) {
				ans[k] = right[j];
				j++;
				k++;
			}
		}
		return ans;
	}
}
