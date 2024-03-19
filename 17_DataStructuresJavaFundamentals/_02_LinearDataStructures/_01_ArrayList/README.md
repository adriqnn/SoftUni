# ArrayList Documentation

Overview:

ArrayList in Java is a dynamic array implementation of the List interface. It allows for flexible manipulation of elements and automatically handles resizing when the capacity is exceeded.

Methods:

* boolean add(E element) - 
    Adds an element at the end of the sequence.
    Returns true if successful.
    Increases the size of the structure and ensures sufficient space for addition.
* boolean add(int index, E element) - 
    Adds an element at the specified index.
    Validates the index, shifts remaining elements to the right.
    Increases the size of the structure if necessary.
* E get(int index) - 
    Returns the element at the given index.
    Does not remove the element from the collection.
    Throws IndexOutOfBoundsException if the index is invalid.
* E set(int index, E element) - 
    Sets the element at the given index.
    Returns the previously stored element at that index.
    Validates the index and throws IndexOutOfBoundsException if validation fails.
* E remove(int index) - 
    Removes the element at the specified index and returns it.
    Validates the index.
    Validates the index and throws IndexOutOfBoundsException if validation fails.
* int size() - 
    Returns the number of elements in the ArrayList.
* int indexOf(E element) - 
    Returns the index of the element if present.
    Returns -1 if the element is not present in the structure.
* boolean contains(E element) - 
    Returns true or false if the element is present inside the structure.
* boolean isEmpty() - 
    Returns true if there are no elements stored, otherwise false.
