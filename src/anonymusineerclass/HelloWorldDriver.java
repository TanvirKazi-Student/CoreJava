package anonymusineerclass;

public class HelloWorldDriver {

	public static void main(String[] args) {

//		HelloWorld englishGreeting  = new EnglishGreeting();
//		
//		englishGreeting.greet();
//		englishGreeting.greetSomeOne("Tanvir");

		HelloWorld englishGreeting  = new HelloWorld() {
			String name = "world";

			@Override
			public void greetSomeOne(String someone) {
				String name = someone;
				System.out.println("Hello: " + name);

			}

			@Override
			public void greet() {
				System.out.println(name);

			}
		};
		
		HelloWorld spanishGreeting = new HelloWorld() {
			 String name = "tout le monde";
			@Override
			public void greetSomeOne(String someone) {
				name = someone;
                System.out.println("Salut: " + name);
				
			}
			
			@Override
			public void greet() {
				System.out.println("tout le monde");
			}
		};
		englishGreeting.greet();
		englishGreeting.greetSomeOne("Tanvir");
		spanishGreeting.greet();
		spanishGreeting.greetSomeOne("Soyab");
		
	}
	
	
}
