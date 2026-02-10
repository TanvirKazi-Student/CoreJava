package StringBuilder;

public class InterviewQue2 {

    // StringBuilder and StringBuffer dose not override the equals() and hashCode() methods from the Object class.
	// but String class does override these methods

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Hi");
		StringBuilder sb2 = new StringBuilder("Hi");

		System.out.println(sb1.compareTo(sb2));
		System.out.println(sb1 == sb2);// F
		System.out.println(sb1.equals(sb2));// F
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());

		String s1 = new String(sb1);
		String s2 = new String(sb2);
		System.out.println(s1.equals(s2));// T
	}

}
