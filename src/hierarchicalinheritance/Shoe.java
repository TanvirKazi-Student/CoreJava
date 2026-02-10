package hierarchicalinheritance;

public class Shoe {

	String brand;
	int size;
	double price;

	public Shoe() {

	}

	public Shoe(String brand, int size, double price) {

		this.brand = brand;
		this.size = size;
		this.price = price;
	}
	
	 public void displayShoeInfo() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Size: " + size);
	        System.out.println("Price: " + price);
	    }
	

}
