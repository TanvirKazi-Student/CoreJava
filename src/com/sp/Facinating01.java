package com.sp;

import java.util.Iterator;

public class Facinating01 {

	public static void main(String[] args) {
		int num = 192;
		if (isFacinating1(num)) {
			System.out.println("Facinating number");
		} else {
			System.out.println("is Not Facinating Number");
		}
	}

	public static int count(int num) {
		int ct = 0;
		for (int i = num; num != 0; num /= 10) {
			ct++;
		}
		return ct;
	}

	public static int power(int base, int arise) {
		int pow = 1;
		for (int i = 0; i < arise; i++) {
			pow = pow * base;
		}
		return pow;

	}

	public static boolean isFacinating1(int num) {
		int number = ((num * power(10, count(num * 2)) + (num * 2)) * power(10, count(num * 3))) + (num * 3);
		System.out.println(number);

		boolean[] check = new boolean[9];
		
		while (number != 0) {
			check[number % 10 - 1] = true;
			number /= 10;
		}

		for (int i = 0; i < check.length; i++) {
			if (check[i] != true) {
				return false;
			}
		}
		return true;
	}

}
