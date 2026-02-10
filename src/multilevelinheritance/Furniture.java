package multilevelinheritance;

public class Furniture {

	String material;
	String color;
	double weight;
	double prise;
	String brand;

	public Furniture() {

	}

	public Furniture(String material, String color, double weight, double prise, String brand) {
		this.material = material;
		this.color = color;
		this.weight = weight;
		this.prise = prise;
		this.brand = brand;
	}

	public void displayFurniture() {
		System.out.println("Material" + material);
		System.out.println("Color" + color);
		System.out.println("Weight" + weight);
		System.out.println("Prise" + prise);
		System.out.println("Brand" + brand);
	}

}
