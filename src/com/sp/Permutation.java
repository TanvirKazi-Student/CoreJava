package com.sp;

import java.util.Arrays;

import javax.security.auth.login.CredentialException;

public class Permutation {

	public static void main(String[] args) {
		char[] ar = { 'a', 'b', 'c', 'd' };
		createpermutation(ar, 0);
	}

	public static void createpermutation(char[] ar, int fix) {
		if (fix == ar.length - 1) {// 0==3,1==3
			System.out.println(Arrays.toString(ar));
			return;
		}

		for (int i = fix; i < ar.length; i++) {//0
			swap(ar, fix, i);//fix = a
			createpermutation(ar, fix + 1);//fix = b
			swap(ar, i, fix);
		}

	}

	public static void swap(char[] ch, int i, int j) {
		char temp = ch[i];//temp=a
		ch[i] = ch[j];//
		ch[j] = temp;
	}

}
