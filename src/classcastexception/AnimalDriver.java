package classcastexception;

public class AnimalDriver {

	public static void main(String[] args) {
		Animal a = new Dog();// upcasting
		a.makeSound();

		Cat c = (Cat) a;// try to cast the dog object into cat object refrenace classCastException
//		c.bark();//classcastexception.AnimalDriver.
	}
}
