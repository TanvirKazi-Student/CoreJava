package thread;

public class Thred2 extends Thread {

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + "started");

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println(Thread.currentThread().getName() + "ended");
	}
}
