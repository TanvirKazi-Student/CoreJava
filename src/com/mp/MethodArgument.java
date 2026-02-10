package com.mp;

public class MethodArgument {
	public static void main(String[] args) {
		addition(42, 4);//actual argument
		substraction(42, 4);
		// addition(42,4,4);
		multiplication(42,4);
	}

	public static void addition(int a, int b) {//formal argument
		int res = a + b;
		System.out.println(res);
	}

	public static void substraction(int a, int b) {
		int res = a - b;
		System.out.println(res);
	}
	public static void multiplication(int a, int b) {
		int res = a * b;
		System.out.println(res);
	}
}
