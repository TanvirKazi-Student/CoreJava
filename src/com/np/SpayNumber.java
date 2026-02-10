package com.np;

import java.util.Scanner;

public class SpayNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");//123
		int num = sc.nextInt();
		int sum = 0;//6
		int prd = 1;//6

		for (int i = num; i > 0; i = i / 10) {//T,T,T,F
			int last = i % 10;//3,2,1
			sum = sum + last;//6
			prd = prd * last;//6
		}
		if (sum == prd) {
			System.out.println("Number is SpayNumber ");
		} else {
			System.out.println("Number is Not SpayNumber");
		}
	}
}
