package singlelevelinheritance;

public class Developer extends SoftwareEngineer {
	String dName;
	int developerId;
	String specialization;
	String primaryLanguage;
	String frameworks;
	String tools;
	int codingExperience;
	boolean isFullStack;
	String projects;

	public Developer() {

	}

	public Developer(String name, int employeeId, String department, String email, long phoneNumber, String education,
			double salary, int experienceYears, String skills, String role, String dName, int developerId,
			String specialization, String primaryLanguage, String frameworks, String tools, int codingExperience,
			boolean isFullStack, String projects) {

		super(name, employeeId, department, email, phoneNumber, education, salary, experienceYears, skills, role);
//        super();

//		this.name = name;
//		this.employeeId = employeeId;
//		this.department = department;
//		this.email = email;
//		this.phoneNumber = phoneNumber;
//		this.education = education;
//		this.salary = salary;
//		this.experienceYears = experienceYears;
//		this.skills = skills;
//		this.role = role;

		this.dName = dName;
		this.developerId = developerId;
		this.specialization = specialization;
		this.primaryLanguage = primaryLanguage;
		this.frameworks = frameworks;
		this.tools = tools;
		this.codingExperience = codingExperience;
		this.isFullStack = isFullStack;
		this.projects = projects;

	}

	public void displayDeveloper() {
		displaySoftwareEngineer();
		System.out.println("Devoloper Name" + dName);
		System.out.println("DevoloperId" + developerId);
		System.out.println("Specialization" + specialization);
		System.out.println("PrimaryLanguage" + primaryLanguage);
		System.out.println("Framework" + frameworks);
		System.out.println("Tools" + tools);
		System.out.println("CodingExperiance" + codingExperience);
		System.out.println("IsFullstack" + isFullStack);
		System.out.println("Projects" + projects);

	}
}
