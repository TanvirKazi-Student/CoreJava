package collection;

public class ArrayList<E> {

	Object[] ar;
	int count = 0;
	int initialCap = ResizableArray.intialCap;

	ArrayList() {
		ar = new Object[initialCap];
	}

	ArrayList(int initialCap) {
		this.initialCap = initialCap;
		ar = new Object[initialCap];
	}

	public boolean add(Object o) {
		if (count < ar.length * ResizableArray.loadFactor) {
			ar[count] = o;
			count++;
		} else {
			Object[] temp = new Object[ar.length * 2];
			for (int i = 0; i < count; i++) {
				temp[i] = ar[i];
			}
			ar = temp;
		}
		ar[count] = o;
		return true;
	}

	public int size() {
		return count;
	}

	public String toString() {
		String op = "[";
		for (int i = 0; i < count; i++) {
			if (i < count - 1) {
				op = op + ar[i] + " ";
			} else {
				op = op + ar[i];

			}
		}
		return op + "]";

	}

	public boolean add(int index, E o) {
		if (index <= count) {
			if (count + 1 < ar.length * ResizableArray.loadFactor) {
				rightShift(index);
				ar[index] = o;
				count++;
				return true;
			}
		} else {
			Object[] temp = new Object[ar.length * 2];
			for (int i = 0; i < count + 1; i++) {
				if (i < index) {
					temp[i] = ar[i];
				} else if (i == index) {
					temp[i] = 0;
				} else {
					temp[i] = ar[i - 1];
				}
				ar = temp;
				count++;
				return true;
			}

		}
		throw new ArrayIndexOutOfBoundsException("Cant insert the element");

	}

	private void rightShift(int index) {
		for (int i = count; i > index; i--) {
			ar[i] = ar[i - 1];
		}

	}

	public boolean addAll(int index, ResizableArray<E> ar) {
		if (index >= 0 && index < count && ar != null && ((ArrayList<E>) ar).count != 0) {
			ArrayList<E> list = (ArrayList<E>) ar;
			for (int i = 0; i < this.size(); i++) {

				this.add(index, list.get(i));
				index++;
			}
			return true;
		}
		return false;

	}

	public boolean containsAll(ArrayList<Integer> a2) {

		if (a2 != null && ((ArrayList<E>) a2).count != 0) {
			ArrayList<E> list = (ArrayList<E>) a2;
			for (int i = 0; i < list.size(); i++) {
				if (!this.contains(list.get(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public boolean retainAll(ArrayList<Integer> a2) {

		if (a2 != null || ((ArrayList<E>) a2).count != 0) {
			ArrayList<E> list = (ArrayList<E>) a2;
			ArrayList<E> a = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				if (this.contains(list.get(i))) {
					a.add(list.get(i));
				}
			}
		}
		return false;
	}

//	public boolean contains(E o) {
//		if (count == 0 || ar == null) {
//			return false;
//		}
//		for (int i = 0; i < count; i++) {
//			if (ar[i].equals(o)) {
//				return true;
//			}
//		}
//		return false;
//	}

	public boolean remove(E o) {
		int index = indexof(o);
		if (index != -1) {
			leftShift(index);
			count--;
			return true;
		}
		return false;
	}

	public void leftShift(int index) {
		for (int i = index; i < count; i++) {
			ar[i] = ar[i + 1];
		}
	}

	public void removeAll(ResizableArray ar) {

	}

	public void retainAll() {

	}

	public void clear() {
		for (int i = 0; i < count; i++) {
			ar[i] = null;
		}
		count = 0;
	}

	public boolean equals(Object o) {
		if (o == null) {
			return false;
		} else if (o.getClass() != this.getClass()) {
			return false;
		} else if (this == o) {
			return true;
		} else {
			ArrayList<E> a = (ArrayList<E>) o;
			if (this.count == a.count) {
				for (int i = 0; i < count; i++) {
					if (!this.ar[i].equals(a.ar[i])) {
						return false;
					}
				}
				return true;
			}
			return false;
		}
	}

	public E get(int index) {
		if (index >= 0 && index < count) {
			return (E) ar[index];
		}
		throw new IndexOutOfBoundsException("can not find the element");
	}

	public Object[] toArray() {

		Object[] ans = new Object[count];

		for (int i = 0; i < ans.length; i++) {
			ans[i] = ar[i];
		}
		return ans;

	}

	public boolean isEmpty() {
		return count == 0;
	}

	private int indexof(E o) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i].equals(o)) {
				return i;
			}
		}
		return -1;

	}

	public boolean contains(E o) {
		return indexof(o) != -1;
	}

	public int hashCode() {
		return super.hashCode();
	}

}
