package hasarelationshipaggrigation;
//lazy instantiation
public class Computer {
	String brand;
	String processor;
	int ram;
	int rom;
	double prise;
	double screenSize;
	String color;
	int usbPort;
	Pendrive b1;

	public Computer() {

	}

	public Computer(String brand, String processor, int ram, int rom, double prise, double screenSize, String color,
			int usbPort) {
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
		this.rom = rom;
		this.prise = prise;
		this.screenSize = screenSize;
		this.color = color;
		this.usbPort = usbPort;
	}

	public void displayComputer() {
		System.out.println("brand" + brand);
		System.out.println("processor" + processor);
		System.out.println("ram" + ram);
		System.out.println("rom" + rom);
		System.out.println("prise" + prise);
		System.out.println("screenSize" + screenSize);
		System.out.println("color" + color);
		System.out.println("usbPort" + usbPort);
	}

	public void injectPendrive(String brand, int capacity, String colour, String type, double price,
			boolean isPluggedIn) {
		b1 = new Pendrive(brand, capacity, colour, type, price, isPluggedIn);
		System.out.println("Pendrive is inject");
		b1.displayPendrive();
	}

}
