package binarysuarch;

import java.util.Arrays;

import bubblesortings.BubbleSorting;

public class BinarySearching {
	public static void main(String[] args) {
		int[] a = { 2, 4, 3, 5, 6 };

		int[] sortArray = BubbleSorting.bubbleSorting(a);
		System.out.println(Arrays.toString(sortArray));

		int index = binarySearch(sortArray, 3);
		if (index != -1) {
			System.out.println("Found at index: " + index);
		} else {
			System.out.println("Not found");
		}
	}

	public static int binarySearch(int[] sortArray, int search) {
		int start = 0;
		int end = sortArray.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (sortArray[mid] == search) {
				return mid;
			} else if (sortArray[mid] < search) {
				start = mid + 1;
			} else if (sortArray[mid] > search) {
				end = mid - 1;
			} else {
				System.out.println("not found index");
			}
		}
		return -1;
	}
}
