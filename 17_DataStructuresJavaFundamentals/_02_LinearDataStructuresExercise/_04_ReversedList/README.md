# ReversedList Documentation

Overview:

ReversedList in Java is a data structure that holds a sequence of elements in reverse order. It uses an underlying array whose capacity grows twice when filled, starting at a capacity of 2.

Methods:

* void add(E element)
    Adds an element to the sequence.
    Grows the underlying array's capacity by a factor of two if full.

* int size()
    Returns the number of elements in the structure.

* int capacity()
    Returns the capacity of the underlying array holding the elements.

* E get(int index)
    Accesses the elements by index in the reverse order of adding.
    Index should be in the range of 0 to size - 1.

* void removeAt(int index)
    Removes an element by index in the reverse order of adding.
    Index should be in the range of 0 to size - 1.

* Iterator<E> iterator()
    Implements an iterator to allow iterating over the elements in a foreach loop in reverse order of their addition.
