package hierarchicalinheritance;

public class ShoeDriver {

	public static void main(String[] args) {
		CasualShoe casual = new CasualShoe("Puma", 9, 2999.0, "Sneaker");

		System.out.println("=== Casual Shoe ===");
		casual.displayCasualShoeInfo();

		FormalShoe formal = new FormalShoe("Nike", 10, 4000.0, "letter");

		System.out.println("=== Formal Shoe ===");
		formal.displayFormalShoeInfo();
		
		SportShoe sport = new SportShoe("Adidas", 11, 5000.0, true);
		
		System.out.println("=== Sport Shoe ===");
		sport.displaySportShoeInfo();
	}
}
