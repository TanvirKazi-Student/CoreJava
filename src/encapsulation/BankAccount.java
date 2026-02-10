package encapsulation;

public class BankAccount {
	private String name;
	private String bankName;
	private long phono;
	private String ifsc;
	private double balance;
	private long accno;
	private String address;
	private long aadhar;
	private int pin;
	private String branch;

	public BankAccount() {
		// TODO Auto-generated constructor stub
	}

	public BankAccount(String name, String bankName, long phono, String ifsc, double balance, long accno,
			String address, long aadhar, int pin, String branch) {

		this.name = name;
		this.bankName = bankName;
		this.phono = phono;
		this.ifsc = ifsc;
		this.balance = balance;
		this.accno = accno;
		this.address = address;
		this.aadhar = aadhar;
		this.pin = pin;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public String bankName() {
		return bankName;
	}

	public long getPhono() {
		return phono;
	}

	public String geIfsc() {
		return ifsc;
	}

	public long getAccno() {
		return accno;
	}

	public String getAddress() {
		return address;
	}

	public long getAadhar() {
		return aadhar;
	}

	public int getPin() {
		return pin;
	}

	public String getBranch() {
		return branch;
	}

	public void setPin(long accno, int oldPin, int newPin) {
		if (this.accno == accno && pin == newPin) {
			System.out.println("Pin already used!");
		} else if (this.accno == accno && pin == oldPin) {
			pin = newPin;
			System.out.println("Pin  Updated! ");
		} else {
			System.out.println("Invalid credentials!");
		}
	}

	public double getBalance(long accono, int pin) {
		if (this.accno == accno && this.pin == pin) {
			return balance;
		}
		System.out.println("Invalid creadentials!");
		return 0;
	}

	public void withdraw(long accno, int pin, double amt) {
		if (this.accno == accno && this.pin == pin) {
			System.out.println("Login success!");
			if (amt > 0 && balance - amt > 1000) {
				balance = balance - amt;
				System.out.println("Amount debited!");
				System.out.println("Your balence:" + balance);
			} else {
				System.out.println("Insufficient balance!");
			}
		} else {
			System.out.println("invalid credentials!");
		}
	}

	public void deposit(long accono, int pin, double amt) {
		if (this.accno == accno && this.pin == pin) {
			System.out.println("Login success!");
			if (amt > 0) {
				balance = balance + amt;
				System.out.println("Amount credited!");
				System.out.println("Your balance:" + balance);
			} else {
				System.out.println("Invalid amount!");
			}
		} else {
			System.out.println("invalid credentials!");
		}
	}

}
