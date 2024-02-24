package implementations;

import interfaces.AbstractReversedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversedList<E> implements AbstractReversedList<E> {
    private static final int INITIAL_CAPACITY = 2;
    private Object[] elements;
    private int size;
    private int capacity;

    public ReversedList() {
        this.elements = new Object[INITIAL_CAPACITY];
        this.size = 0;
        this.capacity = INITIAL_CAPACITY;
    }

    @Override
    public void add(E element) {
        if(this.size == this.elements.length){
            this.elements = grow();
        }

        this.elements[this.size++] = element;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int capacity() {
        return this.elements.length;
    }

    @Override
    public E get(int index) {
        if(this.size > 0){
            ensureIndex(index);
            return this.getAt(size - 1 - index);
        }

        return null;
    }

    @Override
    public E removeAt(int index) {
        if(this.size > 0){
            ensureIndex(index);
            int removeIndex = this.size-1-index;

            E element = getAt(removeIndex);
            shiftArray(index);
            this.elements[this.size-1] = null;

            this.size--;
            return element;
        }

        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int currentIndex = size - 1;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                return (E) elements[currentIndex--];
            }
        };
    }

    @SuppressWarnings("unchecked")
    private E getAt(int index) {
        return (E) this.elements[index];
    }

    private void ensureIndex(int index) {
        if (index < 0 || index >= this.elements.length) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
    }

    private Object[] grow() {
        return Arrays.copyOf(this.elements, this.elements.length * 2);
    }

    private void shiftArray(int index) {
        for (int i = index; i < this.size-1; i++) {
            this.elements[i ] = this.elements[i+1];
        }
    }
}
