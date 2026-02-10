package Problems;

public class Problem {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
				25, 26 };
		removeDuplicateArray(a);

	}

	public static void removeDuplicateArray(int[] a) {
		int[] ct = frequncy(a);
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (ct[i] == -1) {
				count++;
			}
		}

		int[] ans = new int[a.length - count];
		for (int i = 0, j = 0; i < a.length; i++) {
			if (ct[i] != 1) {
				ans[j] = a[i];
				j++;
			}
		}
	}

	public static int[] frequncy(int[] a) {
		int[] ct = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (ct[i] != -1) {
				int count = 1;
				for (int j = 0; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						ct[j] = -1;
					}
				}
				ct[i] = count;
			}
		}
		return ct;
	}

}
