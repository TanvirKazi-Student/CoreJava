package com.mp;

public class ReturnDecimalToHexadecimal {
	public static void main(String[] args) {
		System.out.println(decimalToHexadecimal(9));
	}

	public static String decimalToHexadecimal(int num) {
		String hex = " ";//65,A
		while(num != 0) {//t
			int last = num % 16;//10
			if(last == 0 && last <=9) {
				hex = last +hex;
			}
			else {
				hex = (char) (last + 55)+ hex;//10+55//A
			}
			num /=16;
		}
		return hex;
   	}
}
