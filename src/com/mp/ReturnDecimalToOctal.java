package com.mp;

public class ReturnDecimalToOctal {
	public static void main(String[] args) {
		System.out.println(decimalToOctal(86));
	}

	public static int decimalToOctal(int num) {
		int oct = 0;// 6,26,126
		int raise = 1;// 10,100,1000
		while (num != 0) {// 86,10,1
			int rem = num % 8;// 6,2,1
			oct += rem * raise;// 6,26,126
			raise *= 10;// 10,100,1000
			num /= 8;// 10,1,0
		}
		return oct;
	}
}
