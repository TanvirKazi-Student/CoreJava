package com.pt;

public class Pattern17 {
	public static void main(String[] args) {
		int n = 7;
		int star = (n / 2) + 1;// 4,3,2,1
		for (int i = 0; i < n; i++) {//0,1,2,3,4,5,6
			for (int j = 0; j < star; j++) {//0<4,0<3,0<2,0<1,0<2,0<3,0<4
				System.out.print("*");//4star,3star,2star,1star,2star,3star,4star
			}
			System.out.println();//1,2,3,4,5,6
			if(i<n/2) {//0<3,1<3,2<3,3<3,4<3,5<3
				star--;
			}else {
				star++;//2,3,4
			}
		}
	}
}
