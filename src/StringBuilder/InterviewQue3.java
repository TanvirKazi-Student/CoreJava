package StringBuilder;

public class InterviewQue3 {

	// How to convert the String to Stringbuilder

	public static void main(String[] args) {

		String s1 = "Hi";

		StringBuilder s2 = new StringBuilder(s1);

		String s3 = new String(s2);

		System.out.println(s3);
	}

}
