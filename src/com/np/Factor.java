package com.np;

import java.util.Scanner;

public class Factor{
	public static void main(String[] args) {
		Scanner sec = new Scanner(System.in);
		System.out.println("Enter Number");// 50
		int nums = sec.nextInt();

		for (int denomiter = 1; denomiter <= nums / 2; denomiter++) {
			if (nums % denomiter == 0) {// 50/1=0,50/2=0,50/3!=0,50/4!=0,50/5=0,50/6!=0,50/7!=0,50/8!=0,50/9!=0,50/10=0,
										// 50/25=0,50/50=0
				System.out.println(denomiter);// 1,2,5
			}

		}
		System.out.println(nums);
	}
}
