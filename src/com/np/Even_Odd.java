package com.np;
//With out using % Symboll 
//((number / 2 == number /2.0))
//((number / 2) * 2 == number)
public class Even_Odd {
	public static void main(String[] args) {
		int number = 12;
		
		if ((number / 2) * 2 == number) {
			System.out.println("Number is even: " + number);
		} else {
			System.out.println("Number is odd: " + number);
		}

	}
}
