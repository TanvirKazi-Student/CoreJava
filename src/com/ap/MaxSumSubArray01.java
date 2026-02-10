package com.ap;

import java.util.Arrays;

public class MaxSumSubArray01 {

	public static void main(String[] args) {
		int[] a = { 2, 3, -8, 7, -1, 2, 3 };
		maxSubArray(a);
	}

	public static void maxSubArray(int a[]) {
		int max = 0, p = 0, q = 0;// 2 , 5 ,7,6,8,11
//if all the element is positive then take max element 0
		for (int i = 0; i < a.length; i++) {// i = 0 , i = 3
			for (int j = i; j < a.length; j++) { // j = 0 , j = 1 , j = 2 , j= 3,j = 4,j = 5,j = 6
				int sum = sum(a, i, j);

				if (sum > max) {// 2 > 0 ,2+3 > 2,5+(-8)=-3 !> 5,7>5,6 !> 7 but 6>5, 8> 7 , 11> 8
					max = sum;
					p = i;
					q = j;
				}
			}

		}
		System.out.println("Maximum sum:" + max);
		System.out.println(p + " " + q);

	}

	public static int sum(int[] a, int start, int end) {// 00 ,01 , 02,33,34,35,36
		int sum = 0;
		for (int i = start; i <= end; i++) {// t,t
			sum = sum + a[i];// 2,2+3=5 , 5+(-8)=-3, 7 , 7-1 = 6,6+2 = 8,8+3 = 11
		}
		return sum;
	}
}
