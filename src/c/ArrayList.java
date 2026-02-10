package c;

import java.util.Arrays;

import com.sp.FirstOccurance;

public class ArrayList implements ResizableArray {

	Object[] ar;
	int count = 0;
	int initialCap = ResizableArray.initialCap;

	public ArrayList() {
		ar = new Object[initialCap];
	}

	public ArrayList(int initialCap) {
		this.initialCap = initialCap;
		ar = new Object[initialCap];

	}

	@Override
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

	@Override
	public boolean add(int index, Object o) {
		if (index <= count) {
			if (count + 1 < ar.length * ResizableArray.loadFactor) {
				rightShipt(index);
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
			}
			ar = temp;
			count++;
			return true;

		}
		throw new ArrayIndexOutOfBoundsException();
	}

	public void rightShipt(int index) {
		for (int i = count; i > index; i--) {
			ar[i] = ar[i - 1];
		}
	}

	@Override
	public boolean addAll(ResizableArray ar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int index) {
		if (index < count) {
			leftShift(index);
			count--;
			return true;
		}
		return false;
	}

	public int indexOf(Object o) {
		for (int i = 0; i < count; i++) {
			if (ar[i].equals(o)) {
				return 1;
			} else {
				return -1;
			}
		}
		return 0;
	}

	private void leftShift(int index) {
		for (int i = index; i < count; i++) {
			ar[i] = ar[i + 1];
		}
	}

	@Override
	public boolean remove(Object o) {
		int index = indexOf(o);
		if (index != -1) {
			leftShift(index);
			count--;
			return true;
		}
		return false;
	}

	@Override
	public boolean removeAll(ResizableArray ar) {

		return false;
	}



	@Override
	public boolean contains(Object o) {
		return indexOf(o) != -1;
	}

	@Override
	public boolean containsAll(ResizableArray ar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		for (int i = 0; i < count; i++) {
			ar[i] = null;
			count = 0;
		}
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	public Object get(int index) {
		if (index >= 0 && index < count) {
			return ar[index];
		}
		throw new IndexOutOfBoundsException("can not find element");
	}

	@Override
	public Object toCharArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object o) {
		ArrayList a = (ArrayList) o;
		if (this.count == a.count) {
			for (int i = 0; i < count; i++) {
				if (!this.ar[i].equals(a.ar[i])) {
					return false;
				}
			}
		}
		return true;
	}

	public String toString() {
		String op = "[";
		for (int i = 0; i < count; i++) {
			if (i < count - 1) {
				op = op + ar[i] + ",";
			} else {
				op = op + ar[i];
			}
		}
		return op + "]";
	}

	@Override
	public boolean addAll(int index, ResizableArray ar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean retainAll(ResizableArray ar) {
		// TODO Auto-generated method stub
		return false;
	}

}
