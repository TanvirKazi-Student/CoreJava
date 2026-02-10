package com.ap;
//checks string can be obtained by rotating another string
public class StringsRotationCheck  {

	public static void main(String[] args) {
		String input = "abcd";
		String word = "cdab";
		System.out.println(canMatchRotetion(input, word));
	}

	public static boolean canMatchRotetion(String inpute, String word) {
		if (inpute.length() != word.length()) {
			return false;
		}
		String rot = inpute;// abcd

		for (int i = 0; i < inpute.length() - 1; i++) {
			if (rot.equals(word)) {// abcd == cdab , dabc == cdab, cdab = cdab
				return true;// true
			}
			rot = rotate(rot);// abcd , dabc

		}
		return false;
	}

	public static String rotate(String inpute) {// abcd ,dabc
		String ans = "";// dabc,cdab
		ans += inpute.charAt(inpute.length() - 1);// d,c
		for (int i = 0; i < inpute.length() - 1; i++) {
			ans = ans + inpute.charAt(i);// abc,dab
		}
		return ans;
	}

}
