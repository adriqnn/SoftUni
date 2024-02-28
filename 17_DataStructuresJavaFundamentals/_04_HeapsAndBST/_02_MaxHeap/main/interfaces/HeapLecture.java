package interfaces;

public interface HeapLecture<E extends Comparable<E>> {
    int size();
    void add(E element);
    E peek();
}
