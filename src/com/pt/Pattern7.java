package com.pt;

public class Pattern7 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == (n - 1) / 4 || j == (n - 1) / 4 || j == 3 * (n - 1) / 4 || i == 3 * (n - 1) / 4
						|| i == (n - 1) / 2 && j == (n - 1) / 2 || i < (n - 1) / 4 && i == j
						|| i < (n - 1) / 4 && i + j == n - 1 || i > 3 * (n - 1) / 4 && i == j
						|| i > 3 * (n - 1) / 4 && i + j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
//** **----i<(n-1)/4 && i==j // top left star
//*****--- i == (n-1)/4
// *** ----i==(n-1)/2 && j == (n-1)/2  //meddele stare
//*****----i==3 *(n-1)/4
//** **----i> 3*(n-1) /4 && i==j //down right star
