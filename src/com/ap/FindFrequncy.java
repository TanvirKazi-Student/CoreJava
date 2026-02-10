package com.ap;

//use two pointer approach which is used in occurrence problem.
public class FindFrequncy {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 5, 2, 1, 3 };
		findFrequencyOfEachElement(a);
	}

	public static void findFrequencyOfEachElement(int[] a) {
		boolean[] visited = new boolean[a.length];
		for (int k = 0; k < a.length; k++) {
			if (visited[k])
				continue;
			int count = 0;
			int ele = a[k];
			int i = 0;
			int j = a.length - 1;

			while (i <= j) {
				if (a[i] == ele && !visited[i]) {
					count++;
					visited[i] = true;
				}
				if (i != j && a[j] == ele && !visited[j]) {
					count++;
					visited[j] = true;
				}
				i++;
				j--;
			}
			System.out.println("Element " + ele + " occurs " + count + " times");
		}

	}
}
