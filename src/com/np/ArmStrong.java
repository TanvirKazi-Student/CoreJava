package com.np;

import java.util.Iterator;
import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");// 153
		int num = sc.nextInt();
		int sum = 0;// 153
		int count = 0;
		int temp = num;
		for (int i = num; i != 0; i = i / 10) {// 153,15,1
			count++;// 3
		}
		for (int i = num; i != 0; i = i / 10) {
			int last = i % 10;// 5,4,1

			int power = 1;
			for (int times = 0; times < count; times++) {
				power *= last;// 125,27,1

			}
			sum = sum + power;
		}
		if (sum == temp) {// 153==153
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not ArmStrong Number");

		}

	}

}
