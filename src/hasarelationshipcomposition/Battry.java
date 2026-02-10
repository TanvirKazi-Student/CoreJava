package hasarelationshipcomposition;

public class Battry {
	String batryName;
	double batryPrise;
	int mah;
	String type;

	public Battry() {

	}

	public Battry(String batryName, double batryPrise, int mah, String type) {
		super();
		this.batryName = batryName;
		this.batryPrise = batryPrise;
		this.mah = mah;
		this.type = type;
		System.out.println("Battry  Object is Created");
	}

	public void displayBattry() {
		System.out.println(batryName);
		System.out.println(batryPrise);
		System.out.println(mah);
		System.out.println(type);
	}
}
