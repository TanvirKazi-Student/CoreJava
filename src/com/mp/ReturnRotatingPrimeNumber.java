//package com.mp;
//
//public class ReturnRotatingPrimeNumber {
//
//	public static void main(String[] args) {
//		for (int start = 1; start < 1000; start++) {
//			if (printRotation(start)) {
//				System.out.println(start);
//			}
//		}
//	}
//
//	private static boolean printRotation(int start) {
//
//		return false;
//	}
//
//	public static int rotate(int num) {
//		return num;
//
//	}
//
//	public static boolean isrotate(int num) {
//		int rot = num;
//		if(isPrime(rot)) {
//			do {
//				rot = rotate(rot);
//				if(isPrime(rot)) {
//					continue;
//				}else {
//					return false;
//				}
//			}
//		}
//		while(rot!=num);
//		return true;
//		
//	}
//
//	public static boolean isPrime(int num) {
//		int den = 2;
//		while (num > den) {
//			if (num % den == 0) {
//				return false;
//			}
//			den++;
//		}
//		return true;
//	}
//}
