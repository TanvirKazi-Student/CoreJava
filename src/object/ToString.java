package object;

public class ToString {

	int id;
	String name;
	String collegeName;
	int noOfDept;

	public ToString(int id, String name, String collegeName, int noOfDept) {
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
		this.noOfDept = noOfDept;
	}

	@Override
	public String toString() {
		return "[ id: " + id + " name " + name + " collegename: " + collegeName + " numberofdepartment: " + noOfDept
				+ "]";
	}

	public static void main(String[] args) {
		ToString o = new ToString(101, "Tanvir", "Fabtech", 4);
		System.out.println(o);
	}

}
