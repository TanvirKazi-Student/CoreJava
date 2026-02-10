package com.pt;

public class StarPattern {

	public static void main(String[] args) {
		int n = 9;
		int inc = 1; // 2//3

		for (int i = 1; i <= n; i++) {// 1<=9,2<=9,3<=9,4<=9,5<=9,6<=9,7<=9,8<=9,9<=9

			for (int j = 1; j <= inc; j++) {// 1<=1,1<=1,1<=2,1<=2,1<=3,1<=2,1<=2,1<=1,1<=1
				if (i % 2 != 0) {// odd place // 1%2!=0,2%2==0,3%2!=0,4%2==0,5%2!=0,6%2==0,7%2!=0,8%2==0,9%2==0
					System.out.print("*_");// *_ ,*_*_,*_*_*_,*_*_,*_
				} else {
					System.out.print("_*");// even place //_*,_*_*,*_*_,*_
				}
			}
			System.out.println(" ");// when ++ then Check below if condition

			if (i % 2 != 0 && i <= (n / 2) + 1) {// 1 <= (9/2=4)+1
				inc++;
			} else if (i % 2 == 0 && i > (n / 2) + 1) {// 1 > (9/2=4)+1
				inc--;
			}
		}
	}
}

//*_      1  1
//_*      1  2
//*_*_    2  3
//_*_*    2  4
//*_*_*_  3  5
//_*_*_   2  6
//*_*_    2  7
//_*      1  8
//*_      1  9