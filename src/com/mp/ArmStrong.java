package com.mp;

public class ArmStrong {
	
	public static void main(String[] args) {
		if (isArmStrong(153)) { // 153==153
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not ArmStrong Number");
		}
	}

	public static boolean isArmStrong(int num) {
		int sum = 0;
		int count = 0;

		for (int i = num; i != 0; i /= 10) {
			count++;
		}
		for (int i = num; i != 0; i /= 10) {
			int last = i % 10;

			int pow = 1;
			for (int times = 0; times < count; times++) {
				pow = pow * last;

			}
			sum = sum + pow;
		}
		return sum == num;
	}

}
