package com.ap;

public class SearchElement {

	public static void main(String[] args) {
		int[] ar = { 23, 4, 10, 20, 12, 22 };
		int search = 22;
		int i;// 5
		for (i = 0; i < ar.length; i++) {// 0,1,2,3,4
			if (ar[i] == search) {// 23==22,4==22,10==22,20==22,12==22,22==22
				break;
			}
		}
		if (i == ar.length) {// i=5 == ar.legth=6 // F
			System.out.println("Search Element is Not Found");
		} else {
			System.out.println("Search element is Found");
		}

	}

}
