package upcasting;

public class AccountDriver {

	public static void main(String[] args) {
		Account acc = new SavingAccount(101, "Tanvir Kazi", "Saving", 50000.0, "SBI Solapur", "SBINnull0001234",
				"Active", "9876543210", "tanvir@gmail.com", "2024-07-07", 3.5, 5, true, true);
//		acc.displayAccount();// up casting

		SavingAccount s = (SavingAccount) acc;
//		s.displayAccount();
//		s.displaySavingAccount();// down casting

		Account ac = new CurrentAccount(101, "Tanvir Kazi", "Current", 10000.0, "HDFC Akluj", "HDFNnull0001234",
				"Active", "9876543210", "tanvirkazi@gmail.com", "2025-07-24", 223000.0, 12000.0, 1000.0, "Engineering",
				false);
//		ac.displayAccount();// up casting

		CurrentAccount a = (CurrentAccount) ac;
		a.displayAccount();
		a.displayCurrentAccount();// down casting

	}

}
