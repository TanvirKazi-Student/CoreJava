package object;

public class HashCodes {

	int id;
	String name;
	String collegeName;
	int noOfDept;

	public HashCodes(int id, String name, String collegeName, int noOfDept) {
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
		this.noOfDept = noOfDept;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(id) + name.hashCode() + collegeName.hashCode() + Integer.hashCode(noOfDept);
	}

	public static void main(String[] args) {
		HashCodes h1 = new HashCodes(101, "Tanvir", "Fabtech", 4);
		HashCodes h2 = new HashCodes(101, "Tanvir", "Fabtech", 4);

		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
	}

}
