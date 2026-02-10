package hierarchicalinheritance;

public class SportShoe extends Shoe {
	boolean hasGrip;

	public SportShoe() {

	}

	public SportShoe(String brand, int size, double price, boolean hasGrip) {
		super(brand,size,price);
		this.hasGrip = hasGrip;
	}

	public void ware() {
		System.out.println("Waring Formal Shoe hasGrip for style" + hasGrip);
	}

	public void displaySportShoeInfo() {
		displayShoeInfo();
		ware();
		System.out.println("HasGrip" + hasGrip);
	}
}
