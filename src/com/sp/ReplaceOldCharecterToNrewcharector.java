package com.sp;



public class ReplaceOldCharecterToNrewcharector {

	public static void main(String[] args) {
		String s = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		char oldChar ='r';
		char newChar = 'm';

		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == oldChar) {
				result = result +s.charAt(i); 
			}
		}
		System.out.println(result);
	}
}
