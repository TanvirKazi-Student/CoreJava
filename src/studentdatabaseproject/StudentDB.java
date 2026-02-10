package studentdatabaseproject;

public class StudentDB {

	private String user;
	private String pass;

	private Student[] db = new Student[10];
	private boolean checkLogin;

	private int size;

	public StudentDB(String user, String pass) {
		this.user = user;
		this.pass = pass;

		System.out.println("DB Created");
	}

	public boolean login(String user, String pass) {
		if (user == this.user && pass == this.pass) {
			checkLogin = true;
			System.out.println("login success");

		} else {
			System.out.println("Invalid cradantioals");
		}

		return false;

	}

	public boolean addStudent(String name, int age, int year, String degree, String blood, char gender, int roll, int marks) {
		if (checkLogin) {
			if (size<db.length*0.7) {
				db[size] = new Student ( name, age,  year,  degree,  blood, gender, roll,marks) ;
				size++;
			}
		}
		return true;

	}

	public void sortByName() {
		if (checkLogin) {
			for (int i = 0; i < size - 1; i++) {
				for (int j = 0; j < size - 1; j++) {
					if (db[j].name.compareTo(db[j + 1].name) > 0) {
						Student temp = db[j];
						db[j] = db[j + 1];
						db[j + 1] = temp;
					}
				}
			}
			System.out.println("Please login");
		}
	}

}
