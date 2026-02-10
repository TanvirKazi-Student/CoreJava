package com.np;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");// 28
		int num = sc.nextInt();
		int sum = 0;// 68,100,1
		int i = num;
		for (; i > 9; i = sum) {// T,T,T
			for (int j = num; j != 0; j = j / 10) {
				int last = j % 10;// 2,8 //8,6 //0,0,1
				sum += (last * last);// 2*2=4,8*8=64 //8*8=64,6*6=36 //1
				i = sum;
			}
		}
		if (i == 1) {// 1==1
			System.out.println("Enter Number is Happy Number");
		} else {
			System.out.println("Enter Number is Not Happy Number");
		}
	}
}
