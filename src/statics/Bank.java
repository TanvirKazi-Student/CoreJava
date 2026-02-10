package statics;

public class Bank {

	static double balance;

	public static void main(String[] args) {
		System.out.println("Initial Balence: " + balance);
		creadite(1000);
		debited(100);
	}

	public static void creadite(int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("After the Creadating  Balance is: " + balance);
		}
	}

	public static void debited(int amount) {
		if (amount < balance && amount != 0) {
			balance -= amount;
			System.out.println("After the Creadating  Balance is: " + balance);
		}
	}
}
