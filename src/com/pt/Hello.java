package com.pt;

import java.util.Iterator;

public class Hello {

	public static void main(String[] args) {

		int n = 7;
		int star = 1;
		int space = n / 2;// 3

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < n / 2) {
				star += 2;
				space--;
			} else {
				space++;
				star -= 2;
			}
		}
	}

}

// i==0
//00 01 02 03 04-------i+j == n-1 (5-1)= 4
//10 11 12 13 14  
//20 21 22 23 24---------j == n-1
//30 31 32 33 34
//40 41 42 43 44-------i==j

//i==n-1