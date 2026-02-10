package com.mp;

public class ReturnDecimalToBinary {
	public static void main(String[] args) {
//		System.out.println(decimalToBinary(10));
	}

	public static int decimalToBinary(int num) {
		int bin = 0;// 10,1010
		int mul = 1;// 10,100,1000

		while (num != 0) {// 10,5,2,1
			int rem = num % 2;// 0,1,0
			if (rem != 0) {// f,t,f
				bin = mul + bin;// 10,1010
			}
			mul *= 10;// 10,100,1000,10000
			num /= 2;// 5,2,1,0
		}
		return bin;
	}
}
