package singlelevelinheritance;

public class SmartPhone extends MobileDevice {

	boolean hasTouchScreen;
	int cameraResolution;
	int storage;
	boolean hasFingerprintSensor;
	boolean supports5G;

	public SmartPhone() {

	}

	public SmartPhone(String brand, String model, int batteryCapacity, double screenSize, String operatingSystem,
			boolean hasTouchScreen, int cameraResolution, int storage, boolean hasFingerprintSensor,
			boolean supports5G) {
		super(brand, model, batteryCapacity, screenSize, operatingSystem);
//        super();
		
//		this.brand = brand;
//		this.model = model;
//		this.batteryCapacity = batteryCapacity;
//		this.screenSize = screenSize;
//		this.operatingSystem = operatingSystem;
		
		this.hasTouchScreen = hasTouchScreen;
		this.cameraResolution = cameraResolution;
		this.storage = storage;
		this.hasFingerprintSensor = hasFingerprintSensor;
		this.supports5G = supports5G;

	}

	public void displaySmartPhone() {
		displayMobileDevice();
		System.out.println("HasTouchScreen" + hasTouchScreen);
		System.out.println("CameraResolution" + cameraResolution);
		System.out.println("Storage" + storage);
		System.out.println("HasFingerprintSensor" + hasFingerprintSensor);
		System.out.println("supports5G" + supports5G);
		

	}

}
