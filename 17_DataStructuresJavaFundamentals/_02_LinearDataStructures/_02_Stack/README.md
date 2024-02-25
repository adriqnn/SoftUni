# Stack Documentation

Overview:

Stack in Java is a data structure that follows the Last In First Out(LIFO) principle. Elements are added and removed from the top of the stack.

Methods:

* void push(E element)
    Adds an element at the top of the stack.
    Increases the size of the stack.

* E pop()
    Removes the element at the top of the stack and returns it.
    Throws IllegalStateException with an appropriate message if the stack is empty.

* E peek()
    Returns the element at the top of the stack without removing it.
    Throws IllegalStateException with an appropriate message if the stack is empty.

* int size()
    Returns the number of elements inside the stack.

* boolean isEmpty()
    Returns true if the stack contains no elements, otherwise false.
