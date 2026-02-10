package collection;

public class ArrayListDriver<E> {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();
  
		a1.add(10);
		a1.add(20);
		a1.add(10);
		a1.add(20);
		a1.add(10);
		a1.add(20);
		a1.add(10);
		a1.add(20);
		a1.add(10);
		a1.add(20);
		a1.add(10);
		a1.add(20);
		
		System.out.println(a1);
		
		System.out.println("element at the index 0 is "+ a1.get(0));
		System.out.println("element at the index 1 is "+ a1.get(1));
//		System.out.println("element at the index 50 is "+ a1.get(50));
		
		System.out.println(a1.size());
		
		a1.add(0, 100);
		System.out.println(a1);
		
		
	}
}
