package com.mp;

public class ReturnHappyNumber {
	public static void main(String[] args) {
//		System.out.println(isHappy(19));

		if (isHappy(19)) {
			System.out.println("Happy number");
		} else {
			System.out.println("Nothappy number");
		}

	}

	public static boolean isHappy(int num) {
		while (num != 1 && num != 4) {
			num = sumOfDigitss(num);// 19,82,68,100
		}
		return num == 1;// 1==1

	}

	public static int sumOfDigitss(int num) {
		int sum = 0;
		while (num != 0) {
			int last = num % 10;// 9,1,2,8,8,6
			sum = sum + (last * last);// 81+1=82,4+64=68,64+36=100,1+0+0=1
			num /= 10;
		}
		return sum;// 82,68,100

	}
}
