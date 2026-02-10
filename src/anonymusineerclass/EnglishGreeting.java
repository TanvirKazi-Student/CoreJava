package anonymusineerclass;

public class EnglishGreeting implements HelloWorld {
	String word = "Hello";

	@Override
	public void greet() {
		System.out.println(word);

	}

	@Override
	public void greetSomeOne(String someone) {
		String name = someone;
		System.out.println("Hello: " + name);
	}
}
