package com.pt;

public class Pattern15 {
	public static void main(String[] args) {
		int n = 7;
		int star = 1;
		int space = n / 2;// 3

		for (int i = 0; i < n; i++) {// 0,1,2,3,4,5,6

			for (int j = 0; j < space; j++) {// 0<3,0<2,0<1,0<0,0<1,0<2,0<3
				System.out.print(" ");// 3space, 2space ,1space,0space,1space,2space,3space
			}

			for (int j = 0; j < star; j++) {// 0<1 , 0<3 ,0<5,0<7,0<5,0<3,0<1
				System.out.print("*");// 1star ,3star,5star,7star,5star,3star,1star
			}
			System.out.println();// 0,1,2,3,4,5,6

			if (i < n / 2) {// 0<3,1<3,2<3,3<3,4<3,5<3,6<6
				star += 2;// 3,5,7
				space--;// 2,1,0
			} else {
				star -= 2;// 5,3,1
				space++;// 1,2,3
			}
		}
	}
}

//   *
//  ***
// *****
//*******
// *****
//  ***
//   *
