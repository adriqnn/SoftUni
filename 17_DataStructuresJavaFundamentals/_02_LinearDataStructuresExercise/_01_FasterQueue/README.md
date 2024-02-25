# Faster Queue Documentation

Overview:

Queue in Java is a data structure that follows the First In First Out (FIFO) principle. Elements are added to the back of the queue and removed from the front. The Queue has both head and tail node pointers for faster performance.

Methods:

* void offer(E element) Adds an element at the end of the queue. Increases the size of the queue.

* E poll() Removes and returns the first element in the queue. Decreases the size of the queue. Throws IllegalStateException with a chosen message if called on an empty collection.

* E peek() Returns the element at the front of the queue without removing it. Throws IllegalStateException with an appropriate message if the collection is empty.

* int size() Returns the number of elements inside the queue.

* boolean isEmpty() Returns true if the queue contains no elements, otherwise false.

