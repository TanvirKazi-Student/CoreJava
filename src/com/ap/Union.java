//package com.ap;
//
//import java.util.Arrays;
//
//public class Union {
//	public static void main(String[] args) {
//		int[] a = { 1, 2, 3, 4, 5 };
//		int[] b = { 2, 3, 6 };
//		int result[] = union(a, b);
//		System.out.println(Arrays.toString(result));
//	}
//
//	public static int[] union(int[]a,int[]b) {
//		boolean [] check = new boolean[b.length];
//		int count = 0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < b.length; j++) {
//				if(a[i]==b[j]) {
//					check[j] = true;
//					count++;
//				}
//			}
//		}
//		int [] ans = new int[a.length+b.length];
//		for (int i = 0; i < ans.length; i++) {
//			if(i<a.length) {
//				ans[i] = a[i];
//			}else if(!check[j]) {//check[j] == false
//				ans[i<ans.length]
//						i++;
//				j++;
//			}else {
//				i++;
//			}
//		}
//		return b;
//	}
//
//}
