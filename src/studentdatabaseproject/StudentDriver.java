package studentdatabaseproject;

public class StudentDriver {

	public static void main(String[] args) {

		StudentDB sdb1 = new StudentDB("Root", "Root");

		sdb1.login("Root", "Root");
		sdb1.sortByName();
		
	}
}
