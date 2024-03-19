# DoublyLinkedList Documentation

Overview:

DoublyLinkedList in Java is a linear data structure where elements are linked using pointers. Each element, known as a node, contains a value and a reference to the next and the previous node in the sequence.

Methods:

* void addFirst(E element) - Adds an element at the front of the collection. Increases the size of the collection.
* void addLast(E element) - Adds an element after the last element of the collection. Increases the size of the collection.
* E removeFirst() - Removes and returns the first element of the collection. Throws IllegalStateException with an appropriate message if the collection is empty.
* E removeLast() - Removes and returns the last element of the collection. Throws IllegalStateException with an appropriate message if the collection is empty.
* E getFirst() - Returns but does not remove the first element of the collection. Throws IllegalStateException with an appropriate message if the collection is empty.
* E getLast() - Returns but does not remove the last element of the collection. Throws IllegalStateException with an appropriate message if the collection is empty.
* int size() - Returns the number of elements inside the collection.
* boolean isEmpty() - Returns true if the collection contains no elements, otherwise false.
