package com.np;

import java.util.Scanner;

public class XyleamAndPhloemNumber {
	public static void main(String[] ags) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");// 12348
		int num = sc.nextInt();
		int meanSum = 0;// 4+3+2=9
		int endSum = 0;// 8+1=9

		int last = num % 10;// 8
		endSum += last;// 8
		num /= 10;// 1234

		while (num > 9) {// 1234>9,123>9,12>9,1!>9
			last = num % 10;// 4,3,2
			meanSum += last;// 4+3+2
			num /= 10;// 123,12,1
		}
		endSum += num;// 8+1

		if (meanSum == endSum) {
			System.out.println("Xylem Number");
		} else {
			System.out.println("Phloem Number");
		}
	}

}
