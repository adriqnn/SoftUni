package implementations;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReversedListV2<E> implements Iterable<E> {
    private static final int INITIAL_CAPACITY = 2;
    private Object[] elements;
    private int size;
    private int capacity;

    public ReversedListV2() {
        this.elements = new Object[INITIAL_CAPACITY];
        this.size = 0;
        this.capacity = INITIAL_CAPACITY;
    }

    public void add(E element) {
        if (this.size == this.capacity) {
            growCapacity();
        }

        this.elements[size++] = element;
    }

    public int size() {
        return this.size;
    }

    public int capacity() {
        return this.capacity;
    }

    public E get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        return (E) this.elements[this.size - 1 - index];
    }

    public void removeAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        // Shift elements to fill the gap left by removing the element at the specified index
        for (int i = this.size - index - 1; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }

        this.size--;
    }

    private void growCapacity() {
        int newCapacity = this.capacity * 2;
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(this.elements, 0, newElements, 0, this.size);

        this.elements = newElements;
        this.capacity = newCapacity;
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
}