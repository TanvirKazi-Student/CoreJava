package com.pt;

public class Pattern6 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == (n - 1) / 2 || j == (n - 1) / 2) {//(n - 1) / 2 = middle index → (5 - 1) 4 / 2 = 2
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
//  *  
//  *  
//*****
//  *  
//  *  
