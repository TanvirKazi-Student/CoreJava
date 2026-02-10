package numberprogram;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for check Buzz or Not");
		int num = sc.nextInt();

		if (num % 10 == 7 || num % 7 == 0) {
			System.out.println("Buzz Number");
		} else {
			System.out.println("Not Buzz Bumber");
		}
	}
}
