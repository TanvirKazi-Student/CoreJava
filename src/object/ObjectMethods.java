package object;

public class ObjectMethods extends Object {

	@Override
	public String toString() {
		return "This is ObjectMethods class";
	}

	@Override
	public boolean equals(Object obj) {
		return this == obj;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}

//     The following methods belong to Object class, but cannot be overridden
//     because they are final methods in Object class.
//    
//     public final Class<?> getClass()
//     public final void wait() throws InterruptedException
//     public final void wait(long timeout) throws InterruptedException
//     public final void wait(long timeout, int nanos) throws InterruptedException
//     public final void notify()
//     public final void notifyAll()
}
