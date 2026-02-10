package com.mp;

// This is Worng Program
public class ReturnRotetionNumber {
	public static void main(String[] args) {
		printRotation(121);
	}

	public static void printRotation(int num) {
		int rot = num;// 121
		do {
			System.out.println(rot);
			rot = rotate(rot);
		} while (rot != num);
	}

	public static int rotate(int num) {
		int last = num % 10;
		num = num / 10;
		return num;

	}

}
