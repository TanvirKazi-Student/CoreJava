package com.pt;

public class Pattern16 {
	public static void main(String[] args) {
		int n = 5;
		int star = 1;//2,3
		for (int i = 0; i < n; i++) {// 0,1,2,3,4
			for (int j = 0; j < star; j++) {//0<1,0<2,0<3,0<2,0<1
				System.out.print("*");//1star,2star,3star,2star,1star
			}
			System.out.println();//0,1,2,3,4
			if (i < n / 2) {//0<2,1<2,2<2,3<2,4<2
				star++;
			} else {
				star--;//2,1
			}
		}

	}
}
