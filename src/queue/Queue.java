package queue;

public interface Queue<E> {

	int initialcap = 16;

	boolean add(E ele);

	E element();

	boolean offer(E ele);

	E peek();

	E poll();

	E remove();

	int size();

	boolean isEmpty();
	
	boolean equals(Object o);
	
	String toString();
	
	boolean contains(E ref);
	
	void shuffle();
	
	boolean maknextHead(E ele);

}
