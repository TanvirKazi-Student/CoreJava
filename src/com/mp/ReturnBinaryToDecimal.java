package com.mp;

public class ReturnBinaryToDecimal {
	public static void main(String[] arges) {
	//	System.out.println(binaryToDecimal(1010));
	}

	public static int binaryToDecimal(int num) {
		int dec = 0;// 2,10
		int raise = 1;// 2,4,8
		
		while (num != 0) {// 1010,101,10,1
			int last = num % 10;// 0,1,0,1
			if (last != 0) {// f,t,f,t
				dec = last * raise + dec;// 2,10
			}
			raise *= 2;// 2,4,8,16
			num /= 10;// 101,10,1,0
		}
		return dec;

	}

}
