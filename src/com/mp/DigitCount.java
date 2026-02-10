package com.mp;

public class DigitCount {

	public static void main(String[] args) {
		System.out.println(digitCount(13456782));

	}

	public static int digitCount(int num) {
		int count = 0;
		for (int i = num; i != 0; i = i / 10) {
			count++;
		}
		return count;
	}
}
