//package com.sp;
//
//public class LongestPalindromSubStringOrPrintAllPosiblePalindrom {
//
//	public static void main(String[] args) {
//       String s = "ababa";
//       System.out.println(longestPalindromSub(s))
//	}
//
//	public static String longestPalindromSub(String s) {
//		s = addSpace(s);
//		int max = 0, i = 0, j = 0, k = 0;
//		String longest = "";
//		while(i < s.length()) {
//			if(i>0 && k<s.length()) {
//				if(s.charAt(i)-1;j==s.charAt(k)) {
//				  String temp =s.substring(j,i+1);
//				  
//				  temp = lower(temp,' ');
//				  if (temp.length()) {
//					  max = temp.length();
//					  longestPalindromSub = temp; 
//				  }
//				  i++;
//				  j = K = 1;
//				}
//			}
//			else {
//				i++;
//				j = k -i;
//			}
//			String temp = s.subString(j,k+1);
//			
//			temp = remove(temp); 
//			if(temp.length(max)) {
//				max = temp.length();
//				longestpal = temp;
//			}
//			i++;		
//			j = k = 1;
//		}
//		return null;
//	}
//
//	public static void addSpace(String s) {
//
//	}
//
//	public static String remove(String s) {
//		String ans = "";
//
//		for (int i = 0; i < s.length(); i++) {
//			ans += s.charAt(i);
//		}
//		return ans;
//
//	}
//}
