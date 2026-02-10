package trowexception;

import java.util.Scanner;

public class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void withdeaw(double amount) {
		if (amount > balance) {
			throw new RuntimeException("Insufficient balance!" + " " + "becouse of your balance only:" + balance);
		}
		if (amount < balance) {
			System.out.println(balance - amount);
			System.out.println("withdeaw succesfully");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount account = new BankAccount(500);
		System.out.println("Enter amout to the withdrow");
		double amount = sc.nextDouble();
		account.withdeaw(amount);

	}

}
