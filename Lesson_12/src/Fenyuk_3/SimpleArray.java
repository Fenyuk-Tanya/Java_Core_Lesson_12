package Fenyuk_3;

import java.util.Iterator;

public class SimpleArray<E> implements Simple<E> {
	
	private E[] values;
	
	public SimpleArray(){
		values = (E[]) new Object[0];
	}

	@Override
	public Iterator<E> iterator() {
		return new ArrayIterator<E>(values);
	}

	@Override
	public void remove(int index) {
		try {
			E[] temp = values;
			values = (E[]) new Object[temp.length - 1];
			System.arraycopy(temp, 0, values, 0, index);
			int amoutElementAfterIndex = temp.length - index - 1;
			System.arraycopy(temp, index + 1, values, index, amoutElementAfterIndex);
		} catch (ClassCastException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public E get(int index) {
		return values[index];
	}

	@Override
	public boolean add(E e) {
		try {
		E[] temp = values;
		values = (E[]) new Object[temp.length + 1];
		System.arraycopy(temp, 0, values , 0, temp.length);
		values[values.length - 1] = e;
		return true;
		} catch (ClassCastException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	
	

}
