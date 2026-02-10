package hasarelationshipaggrigation;

public class ComputerDriver {
	public static void main(String[] args) {

		Computer c1 = new Computer("HP", "intel", 16, 4, 7000.0, 14.0, "silver", 1);
		c1.displayComputer();
		c1.injectPendrive("HP", 12, "white", "expencive", 1000.0, true);
	}
}
