package multilevelinheritance;

public class Chair extends Furniture {
	int legesCount;
	boolean hasArmrest;
	boolean isFoldable;
	double seatHigh;
	boolean backSpport;

	public Chair() {

	}

	public Chair(String material, String color, double weight, double prise, String brand, int legesCount,
			boolean hasArmrest, boolean isFoldable, double seatHigh, boolean backSpport) {
		super(material, color, weight, prise, brand);
//		this.material = material;
//		this.color = color;
//		this.weight = weight;
//		this.prise = prise;
//		this.brand = brand;

		this.legesCount = legesCount;
		this.hasArmrest = hasArmrest;
		this.isFoldable = isFoldable;
		this.seatHigh = seatHigh;
		this.backSpport = backSpport;
	}

	public void displayChair() {
		displayFurniture();
		System.out.println("LegesCount" + legesCount);
		System.out.println("HasArmrest" + hasArmrest);
		System.out.println("IsFoldable" + isFoldable);
		System.out.println("SeatHigh" + seatHigh);
		System.out.println("BackSpport" + backSpport);
	}

}
