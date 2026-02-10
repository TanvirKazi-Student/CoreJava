package com.mp;

public class DuckNumber {
	public static void main(String[] args) {
		if (duckNumber(10)) {
			System.out.println("Enter Number is duckNumber ");
		} else {
			System.out.println("Enter Number is Not duckNumber");
		}
	}

	public static boolean duckNumber(int num) {
		return num % 10 == 0;
	}
}
