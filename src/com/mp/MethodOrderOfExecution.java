package com.mp;

public class MethodOrderOfExecution {
	public static void main(String[] args) {
		raju();
		raju();
		bhem();
		chutki();
	}

	public static void bhem() {
		System.out.println("I am their Raju");
	}

	public static void raju() {
		System.out.println("Hii chutki");
	}

	public static void chutki() {
		System.out.println("Get lost");
	}
}
