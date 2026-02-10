package com.np;

import java.util.Scanner;

public class ProductOfDigitWhileLoop {
	public static void main(String[] args) {
		Scanner sce = new Scanner(System.in);
		System.out.println("Enter Number :");// 1234,123,12,1,0
		int nums = sce.nextInt();
		int mul = 1;

		while (nums != 0) {// true,true,true,true,false
			int last = nums % 10;// 1234%10=4,123%10=3,12%10=2,1%10=1
			mul = mul * last;// 0*4=4,4*3=12,12*2=24,24*1=24
			nums /= 10;// 1234/10=123,123/10=12,12/10=1,1/10=0
		}
		System.out.println("Multipication of each digit :" + mul);
	}
}
