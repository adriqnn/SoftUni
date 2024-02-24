package implementations;

import interfaces.Deque;

import java.util.Iterator;

public class ArrayDequeV2<E> implements Deque<E> {
    private static final int INITIAL_CAPACITY = 7;
    private Object[] elements;
    private int head;
    private int tail;
    private int size;

    public ArrayDequeV2() {
        this.elements = new Object[INITIAL_CAPACITY];
        this.size = 0;
        int middle = INITIAL_CAPACITY / 2;
        this.head = this.tail = middle;
    }

    @Override
    public void add(E element) {
        addLast(element);
    }

    @Override
    public void offer(E element) {
        addLast(element);
    }

    @Override
    public void addFirst(E element) {
        if (capacityToRightReached()) {
            grow();
        } else if (capacityToLeftReached()) {
            shiftRightAll();
        }

        if (isEmpty()) {
            this.elements[this.head] = element;
        } else {
            this.elements[--this.head] = element;
        }

        this.size++;
    }

    @Override
    public void addLast(E element) {
        if (capacityToLeftReached()) {
            grow();
        } else if (capacityToRightReached()) {
            shiftLeftAll();
        }

        if (isEmpty()) {
            this.elements[this.tail] = element;
        } else {
            this.elements[++this.tail] = element;
        }

        this.size++;
    }

    @Override
    public void push(E element) {
        addFirst(element);
    }

    @Override
    public void insert(int index, E element) {

        ensureValidIndex(index);
        index += this.head;

        if (index == this.head) {
            addFirst(element);
        } else {
            if (capacityToRightReached()) {
                grow();
            }

            shiftRight(index);
            this.elements[index] = element;
            this.size++;
        }
    }

    @Override
    public void set(int index, E element) {
        ensureValidIndex(index);
        index += this.head;
        this.elements[index] = element;
    }

    @Override
    public E peek() {
        if (!isEmpty()) {
            return getAt(this.head);
        }

        return null;
    }

    @Override
    public E poll() {
        if (!isEmpty()) {
            return removeLast();
        }

        return null;
    }

    @Override
    public E pop() {
        if (!isEmpty()) {
            return removeFirst();
        }

        return null;
    }

    @Override
    public E get(int index) {
        ensureValidIndex(index);
        index += this.head;
        return getAt(index);
    }

    @Override
    public E get(Object object) {
        if (!isEmpty()) {
            for (int i = this.head; i <= this.tail; i++) {
                E current = getAt(i);

                if (current.equals(object)) {
                    return current;
                }
            }
        }

        return null;
    }

    @Override
    public E remove(int index) {
        ensureValidIndex(index);
        index += this.head;

        E element = getAt(index);
        shiftLeft(index + 1);

        this.size--;
        return element;
    }

    private void shiftLeft(int index) {
        for (int i = index; i <= this.tail; i++) {
            this.elements[i - 1] = this.elements[i];
        }

        this.elements[this.tail] = null;
        this.tail--;
    }

    @Override
    public E remove(Object object) {
        if (!isEmpty()) {
            for (int i = this.head; i <= this.tail; i++) {
                E current = getAt(i);

                if (current.equals(object)) {
                    shiftLeft(i + 1);
                    this.size--;

                    return current;
                }
            }
        }

        return null;
    }

    @Override
    public E removeFirst() {
        if (!isEmpty()) {
            E element = getAt(this.head);
            this.elements[this.head] = null;
            this.head++;
            this.size--;

            return element;
        }

        return null;
    }

    @Override
    public E removeLast() {
        if (!isEmpty()) {
            E element = getAt(this.tail);
            this.elements[this.tail] = null;
            this.tail--;
            this.size--;

            return element;
        }

        return null;
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
    public void trimToSize() {
        Object[] newElements = new Object[this.size];

        for (int i = 0, j = this.head; i < this.size; i++) {
            newElements[i] = this.elements[j++];
        }

        this.elements = newElements;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = head;

            @Override
            public boolean hasNext() {
                return index <= tail;
            }

            @Override
            public E next() {
                return getAt(index++);
            }
        };
    }

    @SuppressWarnings("unchecked")
    private E getAt(int index) {
        return (E) this.elements[index];
    }

    private void shiftRight(int index) {
        for (int i = this.tail; i >= index; i--) {
            this.elements[i + 1] = this.elements[i];
        }

        this.tail++;
    }

    private void shiftLeftAll() {
        for (int i = this.head; i <= this.tail; i++) {
            this.elements[i - 1] = this.elements[i];
        }

        this.head--;
        this.tail--;
    }

    private void shiftRightAll() {
        for (int i = this.tail; i >= this.head; i--) {
            this.elements[i + 1] = this.elements[i];
        }

        this.head++;
        this.tail++;
    }

    private void ensureValidIndex(int index) {
        if (index < 0 || index + this.head > this.tail) {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean capacityToRightReached() {
        return this.tail == this.elements.length - 1;
    }

    private void grow() {
        int newCapacity = this.elements.length * 2 + 1;
        Object[] newElements = new Object[newCapacity];
        int newMiddle = newCapacity / 2;

        this.head = newMiddle - this.elements.length / 2;
        this.tail = newMiddle + this.elements.length / 2;

        for (int i = this.head, j = 0; i <= this.tail; i++, j++) {
            newElements[i] = this.elements[j];
        }

        this.elements = newElements;
    }

    private boolean capacityToLeftReached() {
        return this.head == 0;
    }
}