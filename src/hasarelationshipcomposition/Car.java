package hasarelationshipcomposition;

public class Car {
	String brand;
	int model;
	String fulType;
	double price;
	String color;
	double milege;
	int topSpeed;
	Engin e;
//	Engin e = new Engin("Petrol", 1000, 2, false);

	public Car() {

	}

	public Car(String brand, int model, String fulType, double price, String color, double milege, int topSpeed,
			String engineType, int horsePower, int cylinderCount, boolean isTurboCharged) {
		this.brand = brand;
		this.model = model;
		this.fulType = fulType;
		this.price = price;
		this.color = color;
		this.milege = milege;
		this.topSpeed = topSpeed;
	    e = new Engin(engineType, horsePower, cylinderCount, isTurboCharged);

	}

	public void diplayCar() {
		System.out.println("brand" + brand);
		System.out.println("model" + model);
		System.out.println("fulType" + fulType);
		System.out.println("price" + price);
		System.out.println("color" + color);
		System.out.println("milege" + milege);
		System.out.println("topSpeed" + topSpeed);
		e.dispayEngin();
	}

}
