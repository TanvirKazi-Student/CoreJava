package singlelevelinheritance;

public class SoftwareEngineerDriver {
	public static void main(String[] args) {
		Developer d = new Developer("Tanvir", 123, "cse", "tanvir@gmail.com", 1234354353, "Bachler of Technology",
				400000, 2, "Java Full Strack", "Full Strack Devoloper", "Rama", 303, "Full-Strack", "java",
				"Spring Boot", "Gite", 2, false, "Teloring Manegment");

		d.displayDeveloper();
//		d.displaySoftwareEngineer();
	}
}
