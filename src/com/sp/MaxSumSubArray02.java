package com.sp;

//kadne's Algorithum
public class MaxSumSubArray02 {
	public static void main(String[] args) {
		int[] ar = { 2, 3, -8, 7, -1, 2, 3 };
		System.out.println(minimumSub(ar));
	}

	public static int minimumSub(int ar[]) {
		int maxSum = Integer.MIN_VALUE;// 0,2,5,0,7,8,11
		int sum = 0;

		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];// 2=0+2,5=2+5,-3=5+(-8),7=0+7,6=7+(-1),8=6+2,11=8+3
			maxSum = sum > maxSum ? sum : maxSum;// 2>0,5>2,-3>5,7>0,6>7,8>7,11>8
			if (sum < 0) {// here sum is go -ve < 0
				sum = 0;// So Assing hole sum is zero
			}
		}
		return maxSum;
	}
}
