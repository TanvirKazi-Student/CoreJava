package object;

public class Clone implements Cloneable {

	int id;
	String name;

	public Clone(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Clone c1 = new Clone(101, "Tanvir");

		Clone c2 = (Clone) c1.clone();

		System.out.println(c1.id + " " + c1.name);
		System.out.println(c2.id + " " + c2.name);
		
		System.out.println(c1==c2);
	}
}
