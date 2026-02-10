package hasarelationshipaggrigation;

public class Simcard extends MobilePhone{
	String provider;
	long phoneNumber;
	String simType;
	double balance;

	public Simcard() {

	}

	public Simcard(String provider, long phoneNumber, String simType, double balance) {
		this.provider = provider;
		this.phoneNumber = phoneNumber;
		this.simType = simType;
		this.balance = balance;
	}
	public void displaySimcard() {
		System.out.println("Provider :"+provider);
		System.out.println("PhoneNumber :"+phoneNumber);
		System.out.println("Sim Type :"+simType);
		System.out.println("Balence :"+balance);
	}
}
