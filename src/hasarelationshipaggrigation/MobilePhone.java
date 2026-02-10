package hasarelationshipaggrigation;

public class MobilePhone {
	String brand;
	String model;
	int ram;
	int storage;
	double price;
	String color;
	Simcard s1;

	public MobilePhone() {

	}

	public MobilePhone(String brand, String model, int ram, int storage, double prise, String color) {
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.storage = storage;
		this.price=prise;
		this.color = color;

	}

	public void diaplayMobilePhone() {
		System.out.println("Brand :" + brand);
		System.out.println("Model :" + model);
		System.out.println("Ram :" + ram);
		System.out.println("Storage :" + storage);
		System.out.println("Prise :" + price);
		System.out.println("Color :" + color);
	}

	public void displaySimcard(String provider, long phoneNumber, String simType, double balance) {
		s1 = new Simcard(provider, phoneNumber, simType, balance);
		s1.displaySimcard();
	}

}
