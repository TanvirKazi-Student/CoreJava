package hierarchicalinheritance;

public class FormalShoe extends Shoe {
	String material;

	public FormalShoe() {

	}

	public FormalShoe(String brand, int size, double price, String material) {
		super(brand, size, price);
		this.material = material;
	}

	public void ware() {
		System.out.println("Waring the Formal shoe material use" + material);
	}

	public void displayFormalShoeInfo() {
		displayShoeInfo();
		System.out.println("material: " + material);
		ware();
	}
}
