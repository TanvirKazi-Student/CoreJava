package hasarelationshipaggrigation;

public class Pendrive {
	String brand;
	int capacity;
	String color;
	String type;
	double price;
	boolean isPluggedIn;

	public Pendrive() {

	}

	public Pendrive(String brand, int capacity, String colour, String type, double price, boolean isPluggedIn) {
		this.brand = brand;
		this.capacity = capacity;
		this.color = colour;
		this.type = type;
		this.price = price;
		this.isPluggedIn = isPluggedIn;
	}

	public void displayPendrive() {
		System.out.println("brand" + brand);
		System.out.println("capacity" + capacity);
		System.out.println("color" + color);
		System.out.println("type" + type);
		System.out.println("prise" + price);
		System.out.println("ispluggedin" + isPluggedIn);
	}

}
