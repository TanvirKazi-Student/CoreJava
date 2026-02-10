package thread;

public class FirstThered extends Thread {

	@Override
	public void run() {
		System.out.println("first thred begning");
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		double id = Thread.currentThread().getId();

		System.out.println(name);
		System.out.println(priority);
		System.out.println(id);
		System.out.println("first thred ending ");
	
	}
}
