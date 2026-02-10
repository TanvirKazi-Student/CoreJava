package upcasting;

public class SavingAccount extends Account {
	double interestRate;
	int withdrawalLimit;
	boolean isSalaryAccount;
	boolean atmCardIssued;

	public SavingAccount(int accountNumber, String accountHolderName, String accountType, double balance, String branch,
			String ifscCode, String status, String phoneNumber, String email, String createdDate, double interestRate,
			int withdrawalLimit, boolean isSalaryAccount, boolean atmCardIssued) {
		super(accountNumber, accountHolderName, accountType, balance, branch, ifscCode, status, phoneNumber, email,
				createdDate);

		this.interestRate = interestRate;
		this.withdrawalLimit = withdrawalLimit;
		this.isSalaryAccount = isSalaryAccount;
		this.atmCardIssued = atmCardIssued;
	}

	public void displaySavingAccount() {
		displayAccount();
		System.out.println("Interest Rate :" + interestRate);
		System.out.println("Withdrawal Limit :" + withdrawalLimit);
		System.out.println("Is Salary Account :" + isSalaryAccount);
		System.out.println("Atm Cards Issued :" + atmCardIssued);
	}

	public static void main(String[] args) {
		Account acc = new SavingAccount(101, "Tanvir Kazi", "Saving", 50000.0, "SBI Solapur", "SBIN0001234", "Active",
				"9876543210", "tanvir@gmail.com", "2024-07-07", 3.5, 5, true, true);
		acc.displayAccount();// up casting

		SavingAccount s = (SavingAccount) acc;
		s.displaySavingAccount();// down casting
	}

}
