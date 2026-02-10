package upcasting;

public class Account {
	int accountNumber;
	String accountHolderName;
	String accountType;
	double balance;
	String branch;
	String ifscCode;
	String status;
	String phoneNumber;
	String email;
	String createdDate;

	public Account() {

	}

	public Account(int accountNumber, String accountHolderName, String accountType, double balance, String branch,
		String ifscCode, String status, String phoneNumber, String email, String createdDate) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.balance = balance;
		this.branch = branch;
		this.ifscCode = ifscCode;
		this.status = status;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.createdDate = createdDate;
	}

	public void displayAccount() {
          System.out.println("AccountNumber :"+accountNumber);
          System.out.println("AccountHolderName :"+accountHolderName);
          System.out.println("AccountType :"+accountType);
          System.out.println("Balance :"+balance);
          System.out.println("Branch :"+branch);
          System.out.println("IfscCode :"+ifscCode);
          System.out.println("Status"+status);
          System.out.println("PhoneNumber:"+phoneNumber);
          System.out.println("Email:"+email);
          System.out.println("CreatedDate:"+createdDate);
	}
}
