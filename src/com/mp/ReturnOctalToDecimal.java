package com.mp;

public class ReturnOctalToDecimal {
	public static void main(String[] args) {
		System.out.println(octalToDecimal(126));
	}

	public static int octalToDecimal(int num) {
		int dec = 0;//6,22
		int mul = 1;//8,64

		while (num != 0) {//126,12,1
			int last = num % 10;//6,2,1
			dec += mul * last;//6,22,86
			mul *= 8;//8,64
			num /= 10;//12,1
		}
		return dec;
	}
}
