package hasarelationshipcomposition;

public class Engin {
	String engineType;
	int horsePower;
	int cylinderCount;
	boolean isTurboCharged;

	public Engin() {

	}

	public Engin(String engineType, int horsePower, int cylinderCount, boolean isTurboCharged) {
		this.engineType = engineType;
		this.horsePower = horsePower;
		this.cylinderCount = cylinderCount;
		this.isTurboCharged = isTurboCharged;
		System.out.println("Engin object create");
	}

	public void dispayEngin() {
		System.out.println("engineType" + engineType);
		System.out.println("horsePower" + horsePower);
		System.out.println("cylinderCount" + cylinderCount);
		System.out.println("isTurboCharged" + isTurboCharged);
	}

}
