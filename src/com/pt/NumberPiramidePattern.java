package com.pt;

public class NumberPiramidePattern {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {

			for (int space = 1; space <= n - i - 1; space++) { // 1234<=4, 123<=3 , 12<=2,,1<=1
				System.out.print(" ");
			}
			for (int star = 1; star <= (i * 2) + 1; star++) {// 1<=1 , 123<=3 ,12345<=5 ,1234567<=7 ,123456789<=9
				System.out.print(star);
			}
			System.out.println(" ");
		}
	}
}

//    1 
//   123 
//  12345 
// 1234567 
//123456789 