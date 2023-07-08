package Fenyuk_3;

public interface Simple<E> extends Iterable<E> {

	boolean add(E e);
	void remove(int index);
	E get(int index);
}
