package com.pt;

public class Pattern18 {
	public static void main(String[] args) {
		int n = 5;
		int star = n;// 5
		int space = 0;// 0

		for (int i = 0; i < n; i++) {// 0,1,2,3,4
			for (int j = 0; j < space; j++) {// 0<0,0<1,0<2,0<1,0<0
				System.out.print(" ");// 0space,1space,2space,1space,0space
			}

			for (int j = 0; j < star; j++) {// 0<5,0<3,0<1,0<3,0<5
				System.out.print("*");// 5star,3star,1star,3star,5star
			}
			System.out.println();// 0,1,2,3,4,5

			if (i < n / 2) {// 0<2,1<2,2<2,3<2,4<2
				space++;// 1,2
				star -= 2;// 3,1
			} else {
				space--;// 1//0
				star += 2;// 3//5
			}
		}

	}
}
