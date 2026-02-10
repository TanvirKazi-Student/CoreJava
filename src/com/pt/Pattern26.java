package com.pt;

public class Pattern26 {
	public static void main(String[] args) {
		int n = 4;
		int evenDiff = 7;
		int oddDiff = 1;
		int num;

		for (int i = 1; i <= n; i++) {
			num = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(num);

				if (j % 2 != 0) {
					num = oddDiff;
				} else {
					num = evenDiff;
				}
			}
			System.out.println();
			evenDiff -= 2;
			oddDiff += 2;
		}
	}
}
