package queue;

public class ArrayQueue<E> {

	Object[] ar;
	int cap = Queue.initialcap;

	int ct = 0;

	public ArrayQueue() {
		ar = new Object[Queue.initialcap];
	}

	public ArrayQueue(int cap) throws Exception {
		if (cap >= 0) {
			this.cap = cap;

			ar = new Object[cap];
		} else {
			throw new Exception("A Queue Can not be the negative size");
		}
	}

	ArrayQueue(Queue<E> ref) {

	}

	public boolean add(E ele) {
		if (ele != null) {
			if (ct < ar.length * 0.75) {
				ar[ct] = ele;
				ct++;
				return true;
			} else {
				Object[] temp = new Object[ar.length * 2];
				for (int i = 0; i < ct; i++) {
					temp[i] = ar[i];
				}

				ar = temp;
				ar[ct] = ele;
				ct++;
				return false;
			}
		}
		return false;
	}

	public E element() {
		if (ar[0] != null) {
			return (E) ar[0];
		}
		return null;
	}

	public boolean offer(E ele) {
		return add(ele);
	}

	public E peek() {
		return element();
	}

//	public E remove() {
//		E val = (E) ar[0];
//
//		for (int i = 1; i < ct; i++) {
//			ar[i - 1] = ar[i];
//		}
//		ar[ct - 1] = null;
//		ct--;
//
//		return val;
//	}
//
//	public E poll() {
//	    if (ct == 0) {
//	        return null;
//	    }
//	    return remove();
// }

	public String toString() {
		String op = "[";
		for (int i = 0; i < ct; i++) {
			if (i < ct - 1) {
				op = op + ar[i] + " ";
			} else {
				op = op + ar[i];
			}
		}
		return op + "]";
	}

	public boolean isEmpty() {
		return ct == 0;
	}
	
	public int size() {
		return ct;
	}

	public boolean contains(E ref) {
		for (int i = 0; i < ct; i++) {
			if(ar[i].equals(ref)) {
				return true;
			}
		}
		return false;
	}
	
	private void shuffle() {
		// TODO Auto-generated method stub

	}

}
