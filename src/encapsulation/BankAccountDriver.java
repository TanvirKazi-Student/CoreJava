package encapsulation;

public class BankAccountDriver {

	public static void main(String[] args) {

		BankAccount b1 = new BankAccount("Raju", "ICICI", 988765434, "icici1234", 300000.0, 1234567891, "pune",
				56781234, 1234, "Deccan");

		System.out.println(b1.getBalance(1234567891, 1234));

		b1.withdraw(1234567891, 1234, 100.0);
		
		b1.setPin(1234567891, 1234, 1000);
		
		b1.deposit(1234567891, 1000, 1500);
		
	}

}
