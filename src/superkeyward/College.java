package superkeyward;

public class College extends University {

	String collegeName;
	int collegeId;
	int code;
	String address;
	int noOfDept;

	public College(String collegeName, int collegeId, int code, String address, int noOfDept, String uName,
			String uType, String uLoc) {
		
		this.collegeName = collegeName;
		this.collegeId = collegeId;
		this.code = code;
		this.address = address;
		this.noOfDept = noOfDept;

		this.uName = uName;
		this.uType = uType;
		this.uLoc = uLoc;

	}

	public void displayCollege() {
		displayUniversity();
		System.out.println(collegeName);
		System.out.println(collegeId);
		System.out.println(code);
		System.out.println(address);
		System.out.println(noOfDept);

	}

}
