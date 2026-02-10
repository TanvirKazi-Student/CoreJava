package com.np;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");// 5! = 5*4*3*2*1
		int num = sc.nextInt();
//first logic
//		int fact = 1;
//
//		while (num > 0) {// true,true,true,true,true,false
//			fact *= num;// 1*5=5,5*4=20,20*3=60,60*2=120,120*1=120
//			numr--;// 5,4,3,2,1
//		}
//		System.out.println(fact);//120
//second logic
		int fact = 1;

		for (int i = 1; i <= num; i++) {//
			fact = fact * i;//1*1=1,1*2=2,2*3=6,6*4=24,24*5=120
		}
		System.out.println(fact);

	}
}
