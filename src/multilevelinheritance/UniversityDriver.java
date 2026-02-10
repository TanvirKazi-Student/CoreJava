package multilevelinheritance;

public class UniversityDriver {
	public static void main(String[] args) {
		Department d = new Department("Dr.Babasalheb Ambedkar", "Raygad", "Raygad", 12342, "Technical", "Fabtech",
				12343, 'A', "Sangola", "Pawar Sir", 6, "Computer Scince And Engineer", "Dahigude Sir", 1, 10, 60, 4);
//		d.displayDepartment();

		College c1 = new College("Greenfield School", "Dr. Rajesh Kumar", "Pune, Maharashtra", 101, "Private",
				"Greenfield College", 202, 'A', "123, MG Road, Pune, Maharashtra", "Ms. Sneha Patil", 10);
		c1.displayCollege();
	}
}
