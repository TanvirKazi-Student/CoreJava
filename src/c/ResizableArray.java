package c;

public interface ResizableArray {

	int initialCap = 10;
	double loadFactor = 0.75;

	boolean add(Object o);

	boolean add(int index, Object o);

	boolean addAll(ResizableArray ar);

	boolean addAll(int index,ResizableArray ar);
	
	boolean remove(int index);

	boolean remove(Object o);

	boolean removeAll(ResizableArray ar);

	boolean retainAll(ResizableArray ar);

	boolean contains(Object o);

	boolean containsAll(ResizableArray ar);

	void clear();

	int size();

	boolean isEmpty();

	Object get(int index);

	Object [] toArray();
	
	Object toCharArray();

	boolean equals(Object o);

	int hashCode();

	int indexOf();
	
	String toString();

}
