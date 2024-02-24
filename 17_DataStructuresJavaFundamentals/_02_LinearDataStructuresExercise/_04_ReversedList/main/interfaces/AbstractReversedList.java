package interfaces;

public interface AbstractReversedList<E> extends Iterable<E> {

    void add(E element);

    E get(int index);

    E removeAt(int index);

    int size();

    int capacity();
}
