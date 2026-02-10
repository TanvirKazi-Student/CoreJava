package studentdatabaseproject;

public class Student {

	String name;
	int age;
	int year;
	String degree;
	final String college = "Fabtech";
	String blood;
	char gender;
	int roll;
	int marks;

	public Student() {

	}

	public Student(String name, int age, int year, String degree, String blood, char gender, int roll, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.year = year;
		this.degree = degree;
		this.blood = blood;
		this.gender = gender;
		this.roll = roll;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", year=" + year + ", degree=" + degree + ", college=" + college
				+ ", blood=" + blood + ", gender=" + gender + ", rolls=" + roll + "]";

	}

}
