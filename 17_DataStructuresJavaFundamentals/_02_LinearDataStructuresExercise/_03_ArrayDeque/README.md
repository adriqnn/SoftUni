# ArrayDeque Documentation

Overview:

ArrayDeque in Java is a double-ended queue implementation using an array. It supports efficient insertion and removal of elements at both ends of the queue.

Methods:

* void add(E element) - 
    Adds an element at the end of the deque.
* void offer(E element) - 
    Adds an element the same way a Queue does.
* void addFirst(E element) - 
    Adds an element in front of all other elements.
* void addLast(E element) - 
    Adds an element after the last one.
* void push(E element) - 
    Adds an element the same way a Stack does.
* void insert(int index, E element) - 
    Inserts an element at the given index.
    Throws IndexOutOfBoundsException if the index is invalid.
* void set(int index, E element) - 
    Sets an element at the given index.
    Throws IndexOutOfBoundsException if the index is invalid.
* E peek() - 
    Peeks an element the same way a Queue and a Stack do.
    Returns null if there are no elements.
* E poll() - 
    Removes the element in front and returns it.
    Returns null if no elements are stored.
* E pop() - 
    Removes the element at the end and returns it.
    Returns null if no elements are stored.
* E get(int index) - 
    Gets an element at the given index.
    Throws IndexOutOfBoundsException if the index is invalid.
* E get(Object object) - 
    Gets the first occurrence of an element and returns it.
    Returns null if there is no such element.
* E remove(int index) - 
    Removes the element at the given index and returns it.
    Throws IndexOutOfBoundsException if the index is invalid.
* E remove(Object object) - 
    Removes the first occurrence of an element if present.
    Returns null if no such element is present.
* E removeFirst() - 
    Removes the element in front and returns it.
    Returns null if no elements are stored.
* E removeLast() - 
    Removes the element at the end and returns it.
    Returns null if no elements are stored.
* int size() - 
    Returns the number of elements stored.
* int capacity() - 
    Returns the capacity of the structure.
* void trimToSize() - 
    Shrinks the capacity to the number of elements so that the two values become equal.
* boolean isEmpty() - 
    Returns true if there are no elements present, otherwise false.
