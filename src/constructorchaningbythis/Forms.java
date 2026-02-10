package constructorchaningbythis;

//constructor chaning
public class Forms {
	String name;
	int age;
	int phon;
	String email;
	String location;
	String blood;
	int telephone;
	String temploc;

	public Forms() {

	}

	// Create constructor for all mendotory fields
	public Forms(String name, int age, int phon, String email, String loction) {
		this.name = name;
		this.age = age;
		this.phon = phon;
		this.email = email;
		this.location = loction;
	}

	// create constructor for all mendotory fields as will as one non menditory
	public Forms(String name, int age, int phon, String email, String location, String blood) {
		this(name, age, phon, email, location);
		this.blood = blood;
	}

	// create constructor for all mendotory fields as will as all non menditory
	public Forms(String name, int age, int phon, String email, String location, String blood, int telephone, String temploc) {
		this(name, age, phon, email, location, blood);
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
		Forms f1 = new Forms("Tanvir", 22, 830829330, "tanvirkazi2786@gmail.com", "Akluj", "O+", 830829330, "Pune");
		f1.displayForm();
		// Using constructor whith all mendetory fields
		Forms f2 = new Forms("Tanvir", 22, 830829330, "tanvirkazi2786@gmail.com", "Akluj");
		f2.displayForm();
		// Using constructor whith all mendetory fields with one non mendetory fields
		Forms f3 = new Forms("Tanvir", 22, 830829330, "tanvirkazi2786@gmail.com", "Akluj", "O+");
		f3.displayForm();
	}

}
