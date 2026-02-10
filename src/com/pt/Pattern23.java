package com.pt;

public class Pattern23 {
	public static void main(String[] args) {
		int n = 5;
		char ch = 'a';
		int num = 1;

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (j % 2 != 0) {
					System.out.print((ch++) + " ");
				} else {
					System.out.print((num++) + " ");
				}
			}
			System.out.println();
		}
	}
}


