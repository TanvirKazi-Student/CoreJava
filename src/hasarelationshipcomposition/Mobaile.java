package hasarelationshipcomposition;

// Early instantiation
import java.util.Scanner;

public class Mobaile {
	String brand;
	String name;
	double prise;
	int ram;
	int rom;
	String processor;
	Battry b1;// "Has-A" relationship

	// Battry b1 = new Battry("Exide",2000, 5000, "Li-ion");

//	Battry b1;
//	{
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter battry name");
//		String batryname = sc.next();
//
//		System.out.println("Enter battry prise");
//		double prise = sc.nextDouble();
//
//		System.out.println("Enter mah");
//		int mah = sc.nextInt();
//
//		System.out.println("Enter battry type");
//		String type = sc.next();
//
//		b1 = new Battry(batryname, prise, mah, type);
//
//	}

	public Mobaile() {
		// TODO Auto-generated constructor stub
	}

	public Mobaile(String brand, String name, double prise, int ram, int rom, String processor, String batryName,
			double batryPrise, int mah, String type) {
		this.brand = brand;
		this.name = name;
		this.prise = prise;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;

		b1 = new Battry(batryName, batryPrise, mah, type);
	}

	public void displayMobile() {
		System.out.println(brand);
		System.out.println(prise);
		System.out.println(name);
		System.out.println(ram);
		System.out.println(rom);
		System.out.println(processor);
		b1.displayBattry();
	}

}
