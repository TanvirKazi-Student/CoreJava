package exception;

import java.util.Scanner;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();

		System.out.println("Enter the Denometer");
		int den = sc.nextInt();
		try {
			int ans = num / den;
			System.out.println(ans);

			String str = "abc";
			int num1 = Integer.parseInt(str);
			
			int arr [] = {10,20,30,40};
			System.out.println(arr[5]);
		} catch (ArithmeticException e) {
			System.out.println("Don't devide by zero");
		} catch (NumberFormatException e) {
			System.out.println("Enter valid Number");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Access valid index");
		}
		System.out.println("Thank you");

	}
}
