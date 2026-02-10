package singlelevelinheritance;

public class SoftwareEngineer {
	String name;
	int employeeId;
	String department;
	String email;
	long phoneNumber;
	String education;
	double salary;
	int experienceYears;
	String skills;
	String role;

	public SoftwareEngineer() {

	}

	public SoftwareEngineer(String name, int employeeId, String department, String email, long phoneNumber,
			String education, double salary, int experienceYears, String skills, String role) {

		this.name = name;
		this.employeeId = employeeId;
		this.department = department;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.education = education;
		this.salary = salary;
		this.experienceYears = experienceYears;
		this.skills = skills;
		this.role = role;

	}

	public void displaySoftwareEngineer() {
		System.out.println("Softaware Engineer name" + name);
		System.out.println("EmployeeId " + employeeId);
		System.out.println("Department" + department);
		System.out.println("Email" + email);
		System.out.println("Phone Number" + phoneNumber);
		System.out.println("Education" + education);
		System.out.println("Salary" + salary);
		System.out.println("ExperienceYears" + experienceYears);
		System.out.println("Skills" + skills);
		System.out.println("Role" + role);

	}

	

}
