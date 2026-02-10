package singlelevelinheritance;

public class MobileDevice {
	String brand;
	String model;
	int batteryCapacity;
	double screenSize;
	String operatingSystem;

	public MobileDevice() {
		
	}

	public MobileDevice(String brand, String model, int batteryCapacity, double screenSize, String operatingSystem) {
		this.brand = brand;
		this.model = model;
		this.batteryCapacity = batteryCapacity;
		this.screenSize = screenSize;
		this.operatingSystem = operatingSystem;
	}

	public void displayMobileDevice() {
		System.out.println("Enter brand" + brand);
		System.out.println("Model" + model);
		System.out.println("Battery capacity" + batteryCapacity);
		System.out.println("Screen Size" + screenSize);
		System.out.println("OperatingSystem");
	}
}
