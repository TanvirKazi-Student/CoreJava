package com.sp;


public class RemoveTheGivenCharecterFromString {

	public static void main(String[] args) {
		String s = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		char remove = 'm';

		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != remove) {
				result = result + s.charAt(i);
			}
		}
		System.out.println(result);
		
	}
}
