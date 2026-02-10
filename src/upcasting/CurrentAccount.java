package upcasting;

public class CurrentAccount extends Account {
	double overdraftLimit;
	double minimumBalance;
	double penaltyCharge;
	String businessName;
	boolean chequeBookIssued;

	public CurrentAccount() {

	}

	public CurrentAccount(int accountNumber, String accountHolderName, String accountType, double balance,
			String branch, String ifscCode, String status, String phoneNumber, String email, String createdDate,
			double overdraftLimit, double minimumBalance, double penaltyCharge, String businessName,
			boolean chequeBookIssued) {
		super(accountNumber, accountHolderName, accountType, balance, branch, ifscCode, status, phoneNumber, email,
				createdDate);

		this.overdraftLimit = overdraftLimit;
		this.minimumBalance = minimumBalance;
		this.penaltyCharge = penaltyCharge;
		this.businessName = businessName;
		this.chequeBookIssued = chequeBookIssued;
	}

	public void displayCurrentAccount() {
		displayAccount();
		System.out.println("overdraftLimit :" + overdraftLimit);
		System.out.println("minimumBalance :" + minimumBalance);
		System.out.println("penaltyCharge :" + penaltyCharge);
		System.out.println("businessName :" + businessName);
		System.out.println("chequeBookIssued :" + chequeBookIssued);
	}

}
