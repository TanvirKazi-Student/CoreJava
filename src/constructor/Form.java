package constructor;

public class Form {
	String name;
	int age;
	int phon;
	String email;
	String location;
	String blood;
	int telephone;
	String temploc;

	public Form() {

	}

	// Create constructor for all mendotory fields
	public Form(String name, int age, int phon, String email, String loc) {
		this.name = name;
		this.age = age;
		this.phon = phon;
		this.email = email;
		location = loc;
	}

	// create constructor for all mendotory fields as will as one non menditory
	public Form(String name, int age, int phon, String email, String location, String blood) {
		this.name = name;
		this.age = age;
		this.phon = phon;
		this.email = email;
		this.location = location;
		this.blood = blood;
	}

	// create constructor for all mendotory fields as will as all non menditory
	public Form(String name, int age, int phon, String email, String loc, String blood, int telephone, String temploc) {
		this.name = name;
		this.age = age;
		this.phon = phon;
		this.email = email;
		this.location = loc;
		this.blood = blood;
		this.telephone = telephone;
		this.temploc = temploc;
	}

	public void displayForm() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("phon:" + phon);
		System.out.println("email:" + email);
		System.out.println("location:" + location);
		System.out.println("blood:" + blood);
		System.out.println("telephone:" + telephone);
		System.out.println("temploc:" + temploc);
	}

	public static void main(String[] args) {
		// Using constructor with all fields
		Form f1 = new Form("Tanvir", 22, 830829330, "tanvirkazi2786@gmail.com", "Akluj", "O+", 830829330, "Pune");
		f1.displayForm();
		// Using constructor whith all mendetory fields
		Form f2 = new Form("Tanvir", 22, 830829330, "tanvirkazi2786@gmail.com", "Akluj");
		f2.displayForm();
		// Using constructor whith all mendetory fields with one non mendetory fields
		Form f3 = new Form("Tanvir", 22, 830829330, "tanvirkazi2786@gmail.com", "Akluj", "O+");
		f3.displayForm();
	}

}
