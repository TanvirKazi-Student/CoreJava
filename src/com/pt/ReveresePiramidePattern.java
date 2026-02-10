package com.pt;

public class ReveresePiramidePattern {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {

			for (int space = 0; space < i; space++) { // 0<0,0<1,0<2,0<3,0<4
				System.out.print(" ");
			}
			for (int star = 0; star < 2 * (n - i) - 1; star++) {// 012345678<9
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

//*********
// *******
//  *****
//   ***
//    *
