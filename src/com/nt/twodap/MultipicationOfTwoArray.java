package com.nt.twodap;

import java.util.Iterator;

public class MultipicationOfTwoArray {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };
		int[][] b = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 }, };
		int[][] c = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int sum = 0;
				for (int k = 0; k < a[j].length; k++) {
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;
				System.out.println(c[i][j]);
			}
		}

	}
}
