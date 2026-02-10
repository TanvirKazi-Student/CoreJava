package multilevelinheritance;

public class OfficeChair extends Chair {
	boolean hasWeels;
	boolean hasAdjustableHeight;
	boolean hasSwivel;
	boolean headrestIncluded;

	public OfficeChair() {

	}

	public OfficeChair(String material, String color, double weight, double prise, String brand, int legesCount,
			boolean hasArmrest, boolean isFoldable, double seatHigh, boolean backSpport, boolean hasWeels,
			boolean hasAdjustableHeight, boolean hasSwivel, boolean headrestIncluded) {
		super(material, color, weight, prise, brand, legesCount, hasArmrest, isFoldable, seatHigh, backSpport);
//		this.material = material;
//		this.color = color;
//		this.weight = weight;
//		this.prise = prise;
//		this.brand = brand;
//		this.legesCount = legesCount;
//		this.hasArmrest = hasArmrest;
//		this.isFoldable = isFoldable;
//		this.seatHigh = seatHigh;
//		this.backSpport = backSpport;

		this.hasWeels = hasWeels;
		this.hasAdjustableHeight = hasAdjustableHeight;
		this.hasSwivel = hasSwivel;
		this.headrestIncluded = headrestIncluded;
	}

	public void displayOfficeChair() {
		displayFurniture();
		displayChair();
		System.out.println("hasWeels" + hasWeels);
		System.out.println("hasAdjustableHeight" + hasAdjustableHeight);
		System.out.println("hasSwivel" + hasSwivel);
		System.out.println("headrestIncluded" + headrestIncluded);
	}
}
