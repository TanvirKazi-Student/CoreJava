package iterator;

public class Student {

	int id;
	String name;
	String college;
	String department;

	public Student() {

	}

	public Student(int id, String name, String college, String department) {
		this.id = id;
		this.name = name;
		this.college = college;
		this.department = department;
	}

	@Override
	public String toString() {
		return " id: " + id + " name: " + name + " college: " + college + " department: " + department;
	}

}
