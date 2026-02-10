package com.mp;

public class MethodOverlodding {
	public static void main(String[] args) {
		add(10, 10);
		add(10, 10, 10);

	}

	public static void add(int a, int b) {
		int res = a + b;
		System.out.println(res);
	}

	public static void add(int a, int b, int c) {
		int res = a + b + c;
		System.out.println(res);
	}
}
