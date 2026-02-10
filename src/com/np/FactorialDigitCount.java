package com.np;

public class FactorialDigitCount {
	public static void main(String[] args) {
		int num = 10;
		int fact = 1;
		for (int i = 1; i <= num; i++) {//
			fact = fact * i;// 1*1=1,1*2=2,2*3=6,6*4=24,24*5=120

		}
		int temp = fact;// 120
		int ct = 0;
		while (temp > 0) {
			temp = temp / 10;// 120/10=12,12/10=1,1/10=0
			ct++;

		}
		System.out.println(ct);

	}

}
