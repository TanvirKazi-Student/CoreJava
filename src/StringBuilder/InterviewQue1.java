package StringBuilder;

public class InterviewQue1 {

	// how the StringBuilder and StringBuffer are mutable classes
	// means that objects created from these classes can be modified after they are
	// created
	// always create object using the new keyward,constructor.

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Hi");

		StringBuilder sb2 = new StringBuilder("By");

		System.out.println(sb1);
		System.out.println(sb2);

		String s1 = "Hello";
		String s2 = s1.concat("uselessFellow");

		System.out.println(s1);
		System.out.println(s2);
	}

}
