package thread;

public class T1Driver {

	//every thread have three proparty
//	public static void main(String[] args) {
//		String name = Thread.currentThread().getName();
//		int priority = Thread.currentThread().getPriority();
//		double id = Thread.currentThread().getId();
//
//		System.out.println(name);
//		System.out.println(priority);
//		System.out.println(id);
//	}

	public static void main(String[] args) {
		System.out.println("main start");
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		double id = Thread.currentThread().getId();

		System.out.println(name);
		System.out.println(priority);
		System.out.println(id);
		System.out.println("main end");
		
		
		FirstThered t1 = new FirstThered();
//		t1.run();
		t1.start();
				
		
//		FirstThered t2 = new FirstThered();
//		t1.start();
		
		
	}
}
